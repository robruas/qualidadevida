package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AulaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataAula;
	private String incioAula;
	private Integer quantidadeAluno;
	private double valor;

	public AulaDTO(final Date dataAula, final String incioAula, final int quantidadeAluno) {
		this.dataAula = dataAula;
		this.incioAula = incioAula;
		this.quantidadeAluno = quantidadeAluno;
	}

	public AulaDTO(final Date dataAula, final String incioAula, final int quantidadeAluno, final double valor) {
		this.dataAula = dataAula;
		this.incioAula = incioAula;
		this.quantidadeAluno = quantidadeAluno;
		this.valor = valor;
	}

	/**
	 * @return the dataAula
	 */
	public Date getDataAula() {
		return dataAula;
	}

	/**
	 * @return the incioAula
	 */
	public String getIncioAula() {
		return incioAula;
	}

	/**
	 * @return the quantidadeAluno
	 */
	public Integer getQuantidadeAluno() {
		return quantidadeAluno;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

}
