package br.com.estudio.qualidadevida.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_contato")
public class TipoContatoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TipoContatoEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_contato")
	private Integer id;

	@Column(name = "descricao")
	private String descricao;
	
	
	@OneToMany(mappedBy = "tipoContato", targetEntity = ContatoEntity.class, fetch = FetchType.LAZY)
	private Set<ContatoEntity> contatos;

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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}


	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

}
