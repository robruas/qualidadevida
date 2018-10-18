package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;

public class ValoresAulaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer quantidadeAluno;
	private double valorAula;
	private double reajuste;

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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ValorDTO [quantidadeAluno=" + quantidadeAluno + ", valorAula=" + valorAula + ", reajuste=" + reajuste
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
		result = prime * result + ((quantidadeAluno == null) ? 0 : quantidadeAluno.hashCode());
		long temp;
		temp = Double.doubleToLongBits(reajuste);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valorAula);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ValoresAulaDTO other = (ValoresAulaDTO) obj;
		if (quantidadeAluno == null) {
			if (other.quantidadeAluno != null)
				return false;
		} else if (!quantidadeAluno.equals(other.quantidadeAluno))
			return false;
		if (Double.doubleToLongBits(reajuste) != Double.doubleToLongBits(other.reajuste))
			return false;
		if (Double.doubleToLongBits(valorAula) != Double.doubleToLongBits(other.valorAula))
			return false;
		return true;
	}

}
