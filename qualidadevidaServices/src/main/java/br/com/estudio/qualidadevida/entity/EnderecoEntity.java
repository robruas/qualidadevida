package br.com.estudio.qualidadevida.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class EnderecoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnderecoEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Integer Id;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "numero_logradouro")
	private int numeroLogradouro;

	@Column(name = "cep")
	private String cep;

	@Column(name = "id_cidade")
	private int idCidade;

	@Column(name = "id_estado")
	private int idEstado;

	@ManyToOne
	@JoinColumn(name = "id_aluno", referencedColumnName = "id_aluno", nullable = false, insertable = true, updatable = true)
	private AlunoEntity aluno;

	@OneToOne
	@JoinColumn(name = "id_tipo_endereco", referencedColumnName = "id_tipo_endereco")
	private TipoEnderecoEntity tipoEndereco;

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
	 * @return the idCidade
	 */
	public int getIdCidade() {
		return idCidade;
	}

	/**
	 * @param idCidade the idCidade to set
	 */
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	/**
	 * @return the idEstado
	 */
	public int getIdEstado() {
		return idEstado;
	}

	/**
	 * @param idEstado the idEstado to set
	 */
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
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
	 * @return the endereco
	 */
	public TipoEnderecoEntity getTipoEndereco() {
		return tipoEndereco;
	}

	/**
	 * @param TipoEndereco the TipoEndereco to set
	 */
	public void setTipoEndereco(TipoEnderecoEntity TipoEndereco) {
		this.tipoEndereco = TipoEndereco;
	}

}
