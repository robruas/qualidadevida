package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ContatoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String numero;
	private TipoContatoDTO tipoContato;

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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipoContato
	 */
	public TipoContatoDTO getTipoContato() {
		return tipoContato;
	}

	/**
	 * @param tipoContato the tipoContato to set
	 */
	public void setTipoContato(TipoContatoDTO tipoContato) {
		this.tipoContato = tipoContato;
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
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipoContato == null) ? 0 : tipoContato.hashCode());
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
		if (id != other.id)
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipoContato == null) {
			if (other.tipoContato != null)
				return false;
		} else if (!tipoContato.equals(other.tipoContato))
			return false;
		return true;
	}

}
