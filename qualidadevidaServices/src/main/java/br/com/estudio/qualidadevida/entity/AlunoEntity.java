package br.com.estudio.qualidadevida.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "aluno")
public class AlunoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlunoEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aluno_id")
	private Integer Id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "sobre_nome")
	private String sobreNome;

	@Column(name = "idade")
	private int idade;

	@Column(name = "altura")
	private double altura;

	@Column(name = "peso")
	private double peso;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nacimento")
	private Date dataNacimento;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@Column(name = "profissao")
	private String profissao;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "aluno", targetEntity = ContatoEntity.class, fetch = FetchType.LAZY)
	private Set<ContatoEntity> contatos;

	@OneToMany(mappedBy = "aluno", targetEntity = EnderecoEntity.class, fetch = FetchType.LAZY)
	private Set<EnderecoEntity> enderecos;

	@OneToMany(mappedBy = "aluno", targetEntity = AgendaAlunoEntity.class, fetch = FetchType.LAZY)
	private Set<AgendaAlunoEntity> agendaAlunos;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
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
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
	 * @return the contatos
	 */
	public Set<ContatoEntity> getContatos() {
		return contatos;
	}

	/**
	 * @param contatos the contatos to set
	 */
	public void setContatos(Set<ContatoEntity> contatos) {
		this.contatos = contatos;
	}

	/**
	 * @return the enderecos
	 */
	public Set<EnderecoEntity> getEnderecos() {
		return enderecos;
	}

	/**
	 * @param enderecos the enderecos to set
	 */
	public void setEnderecos(Set<EnderecoEntity> enderecos) {
		this.enderecos = enderecos;
	}

	/**
	 * @return the agendaAlunos
	 */
	public Set<AgendaAlunoEntity> getAgendaAlunos() {
		return agendaAlunos;
	}

	/**
	 * @param agendaAlunos the agendaAlunos to set
	 */
	public void setAgendaAlunos(Set<AgendaAlunoEntity> agendaAlunos) {
		this.agendaAlunos = agendaAlunos;
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
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		AlunoEntity other = (AlunoEntity) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

}
