package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class EnderecoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String logradouro;
	private String complemento;
	private int numeroLogradouro;
	private String cep;
	private TipoEnderecoDTO tipoEndereco;
	private CidadeDTO cidade;
	private EstadoDTO estado;

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
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the numeroLogradouro
	 */
	public int getNumeroLogradouro() {
		return numeroLogradouro;
	}

	/**
	 * @param numeroLogradouro the numeroLogradouro to set
	 */
	public void setNumeroLogradouro(int numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the tipoEndereco
	 */
	public TipoEnderecoDTO getTipoEndereco() {
		return tipoEndereco;
	}

	/**
	 * @param tipoEndereco the tipoEndereco to set
	 */
	public void setTipoEndereco(TipoEnderecoDTO tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	/**
	 * @return the cidade
	 */
	public CidadeDTO getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(CidadeDTO cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public EstadoDTO getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
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
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + id;
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + numeroLogradouro;
		result = prime * result + ((tipoEndereco == null) ? 0 : tipoEndereco.hashCode());
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
		EnderecoDTO other = (EnderecoDTO) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id != other.id)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numeroLogradouro != other.numeroLogradouro)
			return false;
		if (tipoEndereco == null) {
			if (other.tipoEndereco != null)
				return false;
		} else if (!tipoEndereco.equals(other.tipoEndereco))
			return false;
		return true;
	}

}
