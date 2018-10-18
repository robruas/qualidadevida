package br.com.estudio.qualidadevida.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "valor")
@NamedQueries(value = { @NamedQuery(name = ValoresAulaEntity.OBTER_VALOR_AULA, query = " SELECT v "
		+ "  FROM ValoresAulaEntity v " + "  WHERE v.quantidadeAluno = :quantidadeAluno") })
public class ValoresAulaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String OBTER_VALOR_AULA = "ValoresAulaEntity.obter_valor_aula";

	public ValoresAulaEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantidadeAluno;
	private double valorAula;
	private double reajuste;

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
	 * @return the quantidadeAluno
	 */
	public Integer getQuantidadeAluno() {
		return quantidadeAluno;
	}

	/**
	 * @param quantidadeAluno the quantidadeAluno to set
	 */
	public void setQuantidadeAluno(Integer quantidadeAluno) {
		this.quantidadeAluno = quantidadeAluno;
	}

	/**
	 * @return the valorAula
	 */
	public double getValorAula() {
		return valorAula;
	}

	/**
	 * @param valorAula the valorAula to set
	 */
	public void setValorAula(double valorAula) {
		this.valorAula = valorAula;
	}

	/**
	 * @return the reajuste
	 */
	public double getReajuste() {
		return reajuste;
	}

	/**
	 * @param reajuste the reajuste to set
	 */
	public void setReajuste(double reajuste) {
		this.reajuste = reajuste;
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
		ValoresAulaEntity other = (ValoresAulaEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
