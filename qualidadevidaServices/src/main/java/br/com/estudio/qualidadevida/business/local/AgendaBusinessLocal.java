package br.com.estudio.qualidadevida.business.local;

import br.com.estudio.qualidadevida.dto.AgendaDTO;
import br.com.estudio.qualidadevida.dto.FaturamentoAulaDTO;
import br.com.estudio.qualidadevida.exception.PilatesAppBusinessException;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

public interface AgendaBusinessLocal {

	
	void incluirAgendaAluno(final AgendaDTO agendaDTO) throws PilatesAppSystemException, PilatesAppBusinessException;
	FaturamentoAulaDTO obterFaturamento() throws PilatesAppSystemException, PilatesAppBusinessException;
}
