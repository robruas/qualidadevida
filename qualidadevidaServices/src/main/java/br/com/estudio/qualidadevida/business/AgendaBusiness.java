package br.com.estudio.qualidadevida.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;

import br.com.estudio.qualidadevida.business.help.AgendaBusinessHelp;
import br.com.estudio.qualidadevida.business.local.AgendaBusinessLocal;
import br.com.estudio.qualidadevida.constantes.Constantes;
import br.com.estudio.qualidadevida.dao.AgendaAlunoDAO;
import br.com.estudio.qualidadevida.dao.AgendaDAO;
import br.com.estudio.qualidadevida.dao.AlunoDAO;
import br.com.estudio.qualidadevida.dao.ValoresAulaDAO;
import br.com.estudio.qualidadevida.dto.AgendaAlunoDTO;
import br.com.estudio.qualidadevida.dto.AgendaDTO;
import br.com.estudio.qualidadevida.dto.AulaDTO;
import br.com.estudio.qualidadevida.dto.FaturamentoAulaDTO;
import br.com.estudio.qualidadevida.entity.AgendaEntity;
import br.com.estudio.qualidadevida.entity.AlunoEntity;
import br.com.estudio.qualidadevida.entity.ValoresAulaEntity;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;
import br.com.estudio.qualidadevida.exception.PilatesDaoException;

@Named
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
@Qualifier("AgendaBusinessLocal")
public class AgendaBusiness implements AgendaBusinessLocal {

	public AgendaBusiness() {
		super();
	}

	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	AgendaDAO agendaDAO;
	@Inject
	AgendaAlunoDAO agendaAlunoDAO;
	@Inject
	AlunoDAO alunoDAO;
	@Inject
	ValoresAulaDAO valoresAulaDAO;

	@PostConstruct
	public void init() {
		this.agendaDAO = new AgendaDAO(entityManager);
		this.agendaAlunoDAO = new AgendaAlunoDAO(entityManager);
		this.alunoDAO = new AlunoDAO(entityManager);
		this.valoresAulaDAO = new ValoresAulaDAO(entityManager);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void salvar(AgendaDTO agendaDTO) throws PilatesAppSystemException, PilatesAppBusinessException {
		try {
			AgendaEntity agendaEntity = AgendaBusinessHelp.obterAgendaEntity(agendaDTO);
			this.agendaDAO.save(agendaEntity);

			for (AgendaAlunoDTO agendaAlunoDTO : agendaDTO.getAgendaAlunos()) {
				AlunoEntity alunoEntity =   this.alunoDAO.getById(agendaAlunoDTO.getAluno().getId());
				this.agendaAlunoDAO.save(AgendaBusinessHelp.obterAgendaAlunoEntity(agendaEntity, alunoEntity, agendaAlunoDTO));
			}

		} catch (RuntimeException e) {
			final String msg = "Erro ao incluir Agenda";
			throw new PilatesAppBusinessException(msg, e);
		}
	}

	@Override
	public FaturamentoAulaDTO obterFaturamento() throws PilatesAppSystemException, PilatesAppBusinessException {
		try {
			List<AulaDTO> listaAula = new ArrayList<AulaDTO>();
			FaturamentoAulaDTO faturamentoAulaDTO = new FaturamentoAulaDTO();
			double valorTotalAula = 0;
			for (AulaDTO aula : obterAulasRealizadas()) {
				ValoresAulaEntity valoresAulaEntity = this.valoresAulaDAO.obterValorAula(aula.getQuantidadeAluno());
				double valorAula = valoresAulaEntity.getValorAula()
						+ (valoresAulaEntity.getValorAula() * (valoresAulaEntity.getReajuste() / 100));
				AulaDTO aulaDTO = new AulaDTO(aula.getDataAula(), aula.getIncioAula(), aula.getQuantidadeAluno(),
						valorAula);
				listaAula.add(aulaDTO);
				valorTotalAula = valorTotalAula + valorAula;
			}

			faturamentoAulaDTO.setValorTotalAula(valorTotalAula);
			faturamentoAulaDTO.getAulas().addAll(listaAula);

			return faturamentoAulaDTO;
		} catch (PilatesDaoException e) {
			throw new PilatesAppBusinessException(e);
		} catch (Exception e) {
			throw new PilatesAppSystemException("Erro em obter agenda", e);
		}
	}

	public List<AulaDTO> obterAulasRealizadas() throws PilatesDaoException, PilatesAppSystemException {
		List<Object[]> listAulas = this.agendaDAO.obterAulasRealizadas();
		List<AulaDTO> aulas = new ArrayList<AulaDTO>();
		for (Object[] aula : listAulas) {
			Date dataAula = Constantes.converterStringDate(String.valueOf(aula[0].toString()));
			String incioAula = String.valueOf(aula[1]);
			Integer quantidadeAluno = Integer.valueOf(aula[2].toString());
			AulaDTO aulaDTO = new AulaDTO(dataAula, incioAula, quantidadeAluno);
			aulas.add(aulaDTO);
		}
		return aulas;
	}

}
