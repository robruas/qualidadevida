package br.com.estudio.qualidadevida.facade;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.estudio.qualidadevida.business.local.AgendaBusinessLocal;
import br.com.estudio.qualidadevida.business.local.AlunoBusinessLocal;
import br.com.estudio.qualidadevida.dto.AgendaDTO;
import br.com.estudio.qualidadevida.dto.AlunoDTO;
import br.com.estudio.qualidadevida.dto.AulaDTO;
import br.com.estudio.qualidadevida.dto.FaturamentoAulaDTO;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

@Named
public class AlunoFacade {

	/**
	 * Construtor da classe AlunoFacade
	 *
	 */
	public AlunoFacade() {
		super();
	}

	@Inject
	AlunoBusinessLocal alunoBusiness;

	@Inject
	AgendaBusinessLocal agendaBusiness;

	public List<AlunoDTO> obterAlunos() throws PilatesAppSystemException, PilatesAppBusinessException {
		return alunoBusiness.obterAlunos();
	}

	public void incluirAlunos(final AlunoDTO alunoDTO) throws PilatesAppSystemException, PilatesAppBusinessException {
		alunoBusiness.incluirAlunos(alunoDTO);
	}

	public void incluirAgendaAluno(final AgendaDTO agendaDTO)
			throws PilatesAppSystemException, PilatesAppBusinessException {
		agendaBusiness.incluirAgendaAluno(agendaDTO);
	}

	public FaturamentoAulaDTO obterFaturamento() throws PilatesAppSystemException, PilatesAppBusinessException {
		return agendaBusiness.obterFaturamento();
	}

}
