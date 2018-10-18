package br.com.estudio.qualidadevida.entity;

import java.io.Serializable;

public class AgendaAlunoEntityPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgendaAlunoEntityPK() {
		super();
	}

	private Integer agendaId;
	private Integer alunoId;

	/**
	 * @return the agenda_id
	 */
	public Integer getAgendaId() {
		return agendaId;
	}

	/**
	 * @param agendaId the agenda_id to set
	 */
	public void setAgendaId(Integer agendaId) {
		this.agendaId = agendaId;
	}

	/**
	 * @return the aluno_id
	 */
	public Integer getAlunoId() {
		return alunoId;
	}

	/**
	 * @param alunoId the aluno_id to set
	 */
	public void setAlunoId(Integer alunoId) {
		this.alunoId = alunoId;
	}

}
