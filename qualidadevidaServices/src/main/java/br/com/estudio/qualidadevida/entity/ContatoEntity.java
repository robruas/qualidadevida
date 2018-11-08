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
@Table(name = "contato")
public class ContatoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public ContatoEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato")
	private Integer Id;

	@Column(name = "numero")
	private String numero;

	@ManyToOne
	@JoinColumn(name = "id_aluno", referencedColumnName = "id_aluno")
	private AlunoEntity aluno;

	@OneToOne
	@JoinColumn(name = "id_tipo_contato", referencedColumnName = "id_tipo_contato")
	private TipoContatoEntity tipoContato;

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
	 * @return the tipoContato
	 */
	public TipoContatoEntity getTipoContato() {
		return tipoContato;
	}

	/**
	 * @param tipoContato the tipoContato to set
	 */
	public void setTipoContato(TipoContatoEntity tipoContato) {
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
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
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
		ContatoEntity other = (ContatoEntity) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
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
