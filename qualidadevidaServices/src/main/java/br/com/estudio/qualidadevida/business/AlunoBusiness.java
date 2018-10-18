package br.com.estudio.qualidadevida.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;

import br.com.estudio.qualidadevida.business.help.AlunoBusinessHelp;
import br.com.estudio.qualidadevida.business.local.AlunoBusinessLocal;
import br.com.estudio.qualidadevida.dao.AlunoDAO;
import br.com.estudio.qualidadevida.dao.ContatoDAO;
import br.com.estudio.qualidadevida.dao.EnderecoDAO;
import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.dto.ContatoDTO;
import br.com.estudio.qualidadevida.dto.EnderecoDTO;
import br.com.estudio.qualidadevida.entity.AlunoEntity;
import br.com.estudio.qualidadevida.entity.ContatoEntity;
import br.com.estudio.qualidadevida.entity.EnderecoEntity;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

@Named
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
@Qualifier("AlunoBusinessLocal")  
public class AlunoBusiness implements AlunoBusinessLocal {

	public AlunoBusiness() {
		super();
	}
	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	private AlunoDAO alunoDAO;
	@Inject
	private EnderecoDAO enderecoDAO;
	@Inject
	private ContatoDAO contatoDAO;


	@PostConstruct
	public void init() {
		this.alunoDAO = new AlunoDAO(entityManager);
		this.enderecoDAO = new EnderecoDAO(entityManager);
		this.contatoDAO = new ContatoDAO(entityManager);
	}

	@Override
	public List<AlunoDTO> obterAlunos() throws PilatesAppSystemException, PilatesAppBusinessException {
		try {
			List<AlunoEntity> listaAlunoEntity = alunoDAO.findAll();
			return AlunoBusinessHelp.obterListaAlunos(listaAlunoEntity);

		} catch (Exception e) {
			final String msg = "Erro ao buscar alunos";
			throw new PilatesAppBusinessException(msg, e);
		}
	}
    
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void salvar(final AlunoDTO alunoDTO) throws PilatesAppSystemException, PilatesAppBusinessException {
		try {
			AlunoEntity alunoEntity = AlunoBusinessHelp.obterAlunoEntity(alunoDTO);
			alunoDAO.save(alunoEntity);
			for (EnderecoDTO enderecoDTO : alunoDTO.getEnderecos()) {
				EnderecoEntity enderecoEntity = AlunoBusinessHelp.obterEnderecoEntity(enderecoDTO);
				enderecoEntity.setAluno(alunoEntity);
				enderecoDAO.update(enderecoEntity);
			}
			for (ContatoDTO contatoDTO : alunoDTO.getContatos()) {
				ContatoEntity contatoEntity = AlunoBusinessHelp.obterContatoEntity(contatoDTO);
				contatoEntity.setAluno(alunoEntity);
				contatoDAO.update(contatoEntity);
			}
		} catch (RuntimeException e) {
			final String msg = "Erro ao incluir Aluno";
			throw new PilatesAppBusinessException(msg, e);
		}
	}

	
	public AlunoDTO obterAlunoPorId(final Integer alunoId) throws PilatesAppSystemException, PilatesAppBusinessException {
		try {
			return  AlunoBusinessHelp.obterAlunoDTO(this.alunoDAO.getById(alunoId));
		} catch (Exception e) {
			final String msg = "Erro ao buscar alunos";
			throw new PilatesAppBusinessException(msg, e);
		}
	}
}
