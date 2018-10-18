package br.com.estudio.qualidadevida.facade;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.estudio.qualidadevida.business.local.AgendaBusinessLocal;
import br.com.estudio.qualidadevida.dto.AgendaDTO;
import br.com.estudio.qualidadevida.dto.FaturamentoAulaDTO;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

@Named
public class AgendaFacade {

	/**
	 * Construtor da classe AlunoFacade
	 *
	 */
	public AgendaFacade() {
		super();
	}

	@Inject
	AgendaBusinessLocal agendaBusiness;


	public void salvar(final AgendaDTO agendaDTO)
			throws PilatesAppSystemException, PilatesAppBusinessException {
		agendaBusiness.salvar(agendaDTO);
	}

	public FaturamentoAulaDTO obterFaturamento() throws PilatesAppSystemException, PilatesAppBusinessException {
		return agendaBusiness.obterFaturamento();
	}

}
