package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import br.com.estudio.qualidadevida.enuns.EnumTipoTelefone;
@Component
public class ContatoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int ddd;
	private int numero;
	private EnumTipoTelefone enumTipoTelefone;

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
	 * @return the ddd
	 */
	public int getDdd() {
		return ddd;
	}

	/**
	 * @param ddd the ddd to set
	 */
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the enumTipoTelefone
	 */
	public EnumTipoTelefone getEnumTipoTelefone() {
		return enumTipoTelefone;
	}

	/**
	 * @param enumTipoTelefone the enumTipoTelefone to set
	 */
	public void setEnumTipoTelefone(EnumTipoTelefone enumTipoTelefone) {
		this.enumTipoTelefone = enumTipoTelefone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContatoDTO [id=" + id + ", ddd=" + ddd + ", numero=" + numero + ", enumTipoTelefone=" + enumTipoTelefone
				+ "]";
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
		result = prime * result + ddd;
		result = prime * result + ((enumTipoTelefone == null) ? 0 : enumTipoTelefone.hashCode());
		result = prime * result + id;
		result = prime * result + numero;
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
		ContatoDTO other = (ContatoDTO) obj;
		if (ddd != other.ddd)
			return false;
		if (enumTipoTelefone != other.enumTipoTelefone)
			return false;
		if (id != other.id)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
