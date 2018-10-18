package br.com.estudio.qualidadevida.business.help;

import br.com.estudio.qualidadevida.constantes.Constantes;
import br.com.estudio.qualidadevida.dto.AgendaAlunoDTO;
import br.com.estudio.qualidadevida.dto.AgendaDTO;
import br.com.estudio.qualidadevida.entity.AgendaAlunoEntity;
import br.com.estudio.qualidadevida.entity.AgendaEntity;
import br.com.estudio.qualidadevida.entity.AlunoEntity;
import br.com.estudio.qualidadevida.exception.PilatesAppSystemException;

public class AgendaBusinessHelp {

	public static AgendaEntity obterAgendaEntity(final AgendaDTO agendaDTO) throws PilatesAppSystemException  {
		AgendaEntity agendaEntity = new AgendaEntity();
		agendaEntity.setDataAula(agendaDTO.getDataAula());
		agendaEntity.setHoraInicio(Constantes.converterStringHora(agendaDTO.getHoraInicio()));
		agendaEntity.setHoraFim(Constantes.converterStringHora(agendaDTO.getHoraFim()));

		return agendaEntity;
	}

	public static AgendaAlunoEntity obterAgendaAlunoEntity(final AgendaEntity agendaEntity,
			final AlunoEntity alunoEntity, final AgendaAlunoDTO agendaAlunoDTO) {
		AgendaAlunoEntity agendaAlunoEntity = new AgendaAlunoEntity();
		agendaAlunoEntity.setAgenda(agendaEntity);		
		agendaAlunoEntity.setAluno(alunoEntity);
		agendaAlunoEntity.setAgendaId(agendaEntity.getAgendaId());
		agendaAlunoEntity.setAlunoId(agendaAlunoDTO.getAluno().getId());
		agendaAlunoEntity.setStatusAula(agendaAlunoDTO.getEnumStatusAula().getStatus());
		return agendaAlunoEntity;
	}

}
