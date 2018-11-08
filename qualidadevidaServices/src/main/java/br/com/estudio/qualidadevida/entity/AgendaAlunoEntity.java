package br.com.estudio.qualidadevida.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@IdClass(AgendaAlunoEntityPK.class)
@Table(name = "AgendaAluno")
public class AgendaAlunoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "status_aula")
	private String statusAula;

	@Id
	@Column(name = "id_agenda")
	private Integer agendaId;

	@Id
	@Column(name = "id_aluno")
	private Integer alunoId;

	@OneToOne
	@JoinColumn(name = "id_aluno", referencedColumnName = "id_aluno", insertable = false, updatable = false)
	private AlunoEntity aluno;

	@ManyToOne
	@JoinColumn(name = "id_agenda", referencedColumnName = "id_agenda", insertable = false, updatable = false)
	private AgendaEntity agenda;

	/**
	 * @return the statusAula
	 */
	public String getStatusAula() {
		return statusAula;
	}

	/**
	 * @return the agendaId
	 */
	public Integer getAgendaId() {
		return agendaId;
	}

	/**
	 * @param agendaId the agendaId to set
	 */
	public void setAgendaId(Integer agendaId) {
		this.agendaId = agendaId;
	}

	/**
	 * @return the alunoId
	 */
	public Integer getAlunoId() {
		return alunoId;
	}

	/**
	 * @param alunoId the alunoId to set
	 */
	public void setAlunoId(Integer alunoId) {
		this.alunoId = alunoId;
	}

	/**
	 * @param statusAula the statusAula to set
	 */
	public void setStatusAula(String statusAula) {
		this.statusAula = statusAula;
	}

	/**
	 * @return the aluno
	 */
	public AlunoEntity getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(AlunoEntity aluno) {
		this.aluno = aluno;
	}

	/**
	 * @return the agenda
	 */
	public AgendaEntity getAgenda() {
		return agenda;
	}

	/**
	 * @param agenda the agenda to set
	 */
	public void setAgenda(AgendaEntity agenda) {
		this.agenda = agenda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agendaId == null) ? 0 : agendaId.hashCode());
		result = prime * result + ((alunoId == null) ? 0 : alunoId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgendaAlunoEntity other = (AgendaAlunoEntity) obj;
		if (agendaId == null) {
			if (other.agendaId != null)
				return false;
		} else if (!agendaId.equals(other.agendaId))
			return false;
		if (alunoId == null) {
			if (other.alunoId != null)
				return false;
		} else if (!alunoId.equals(other.alunoId))
			return false;
		return true;
	}

}
