package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;

import br.com.estudio.qualidadevida.enuns.EnumStatusAula;

public class AgendaAlunoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private EnumStatusAula enumStatusAula;
	private AlunoDTO aluno;

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
	 * @return the enumStatusAula
	 */
	public EnumStatusAula getEnumStatusAula() {
		return enumStatusAula;
	}

	/**
	 * @param enumStatusAula the enumStatusAula to set
	 */
	public void setEnumStatusAula(EnumStatusAula enumStatusAula) {
		this.enumStatusAula = enumStatusAula;
	}

	/**
	 * @return the aluno
	 */
	public AlunoDTO getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(AlunoDTO aluno) {
		this.aluno = aluno;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AgendaAluno [id=" + id + ", enumStatusAula=" + enumStatusAula + ", aluno=" + aluno + "]";
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
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((enumStatusAula == null) ? 0 : enumStatusAula.hashCode());
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
		AgendaAlunoDTO other = (AgendaAlunoDTO) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (enumStatusAula != other.enumStatusAula)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
