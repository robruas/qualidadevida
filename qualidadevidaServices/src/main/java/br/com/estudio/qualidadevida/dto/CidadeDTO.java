package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;

public class CidadeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private MicrorregiaoDTO microrregiao;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the microrregiao
	 */
	public MicrorregiaoDTO getMicrorregiao() {
		return microrregiao;
	}

	/**
	 * @param microrregiao the microrregiao to set
	 */
	public void setMicrorregiao(MicrorregiaoDTO microrregiao) {
		this.microrregiao = microrregiao;
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
		result = prime * result + id;
		result = prime * result + ((microrregiao == null) ? 0 : microrregiao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		CidadeDTO other = (CidadeDTO) obj;
		if (id != other.id)
			return false;
		if (microrregiao == null) {
			if (other.microrregiao != null)
				return false;
		} else if (!microrregiao.equals(other.microrregiao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
