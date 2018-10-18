package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AgendaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataAula;
	private String horaInicio;
	private String horaFim;
	private List<AgendaAlunoDTO> agendaAlunos;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the dataAula
	 */
	public Date getDataAula() {
		return dataAula;
	}

	/**
	 * @param dataAula the dataAula to set
	 */
	public void setDataAula(Date dataAula) {
		this.dataAula = dataAula;
	}

	/**
	 * @return the horaInicio
	 */
	public String getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFim
	 */
	public String getHoraFim() {
		return horaFim;
	}

	/**
	 * @param horaFim the horaFim to set
	 */
	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	/**
	 * @return the agendaAlunos
	 */
	public List<AgendaAlunoDTO> getAgendaAlunos() {

		if (this.agendaAlunos == null) {
			this.agendaAlunos = new ArrayList<AgendaAlunoDTO>();
		}

		return agendaAlunos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agenda [id=" + id + ", dataAula=" + dataAula + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim
				+ ", agendaAlunos=" + agendaAlunos + "]";
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
		result = prime * result + ((agendaAlunos == null) ? 0 : agendaAlunos.hashCode());
		result = prime * result + ((dataAula == null) ? 0 : dataAula.hashCode());
		result = prime * result + ((horaFim == null) ? 0 : horaFim.hashCode());
		result = prime * result + ((horaInicio == null) ? 0 : horaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		AgendaDTO other = (AgendaDTO) obj;
		if (agendaAlunos == null) {
			if (other.agendaAlunos != null)
				return false;
		} else if (!agendaAlunos.equals(other.agendaAlunos))
			return false;
		if (dataAula == null) {
			if (other.dataAula != null)
				return false;
		} else if (!dataAula.equals(other.dataAula))
			return false;
		if (horaFim == null) {
			if (other.horaFim != null)
				return false;
		} else if (!horaFim.equals(other.horaFim))
			return false;
		if (horaInicio == null) {
			if (other.horaInicio != null)
				return false;
		} else if (!horaInicio.equals(other.horaInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
