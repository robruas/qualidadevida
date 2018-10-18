package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
@Component
public class AlunoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String sobreNome;
	private int idade;
	private double altura;
	private double peso;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy" )
	private Date dataNacimento;
	private String profissao;
	private String email;
	private List<ContatoDTO> contatos;
	private List<EnderecoDTO> enderecos;

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
	 * @return the sobreNome
	 */
	public String getSobreNome() {
		return sobreNome;
	}

	/**
	 * @param sobreNome the sobreNome to set
	 */
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the dataNacimento
	 */
	public Date getDataNacimento() {
		return dataNacimento;
	}

	/**
	 * @param dataNacimento the dataNacimento to set
	 */
	public void setDataNacimento(Date dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	/**
	 * @return the profissao
	 */
	public String getProfissao() {
		return profissao;
	}

	/**
	 * @param profissao the profissao to set
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the conatos
	 */
	public List<ContatoDTO> getContatos() {
		if (this.contatos == null) {
			this.contatos = new ArrayList<ContatoDTO>();
		}
		return contatos;
	}

	/**
	 * @return the enderecos
	 */
	public List<EnderecoDTO> getEnderecos() {

		if (this.enderecos == null) {
			this.enderecos = new ArrayList<EnderecoDTO>();
		}

		return enderecos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlunoDTO [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", altura="
				+ altura + ", peso=" + peso + ", dataNacimento=" + dataNacimento + ", profissao=" + profissao
				+ ", email=" + email + ", conatos=" + contatos + ", enderecos=" + enderecos + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + ", getSobreNome()=" + getSobreNome() + ", getIdade()=" + getIdade()
				+ ", getAltura()=" + getAltura() + ", getPeso()=" + getPeso() + ", getDataNacimento()="
				+ getDataNacimento() + ", getProfissao()=" + getProfissao() + ", getEmail()=" + getEmail()
				+ ", getConatos()=" + getContatos() + ", getEnderecos()=" + getEnderecos() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((contatos == null) ? 0 : contatos.hashCode());
		result = prime * result + ((dataNacimento == null) ? 0 : dataNacimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((enderecos == null) ? 0 : enderecos.hashCode());
		result = prime * result + id;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
		result = prime * result + ((sobreNome == null) ? 0 : sobreNome.hashCode());
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
		AlunoDTO other = (AlunoDTO) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (contatos == null) {
			if (other.contatos != null)
				return false;
		} else if (!contatos.equals(other.contatos))
			return false;
		if (dataNacimento == null) {
			if (other.dataNacimento != null)
				return false;
		} else if (!dataNacimento.equals(other.dataNacimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enderecos == null) {
			if (other.enderecos != null)
				return false;
		} else if (!enderecos.equals(other.enderecos))
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (profissao == null) {
			if (other.profissao != null)
				return false;
		} else if (!profissao.equals(other.profissao))
			return false;
		if (sobreNome == null) {
			if (other.sobreNome != null)
				return false;
		} else if (!sobreNome.equals(other.sobreNome))
			return false;
		return true;
	}

}
