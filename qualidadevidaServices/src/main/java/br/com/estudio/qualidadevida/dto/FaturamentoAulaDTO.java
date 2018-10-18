package br.com.estudio.qualidadevida.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FaturamentoAulaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double valorTotalAula;
	private List<AulaDTO> aulas;

	/**
	 * @return the valorTotalAula
	 */
	public double getValorTotalAula() {
		return valorTotalAula;
	}

	/**
	 * @param valorTotalAula the valorTotalAula to set
	 */
	public void setValorTotalAula(double valorTotalAula) {
		this.valorTotalAula = valorTotalAula;
	}

	/**
	 * @return the aulas
	 */
	public List<AulaDTO> getAulas() {

		if (this.aulas == null) {
			this.aulas = new ArrayList<AulaDTO>();
		}
		return aulas;
	}

}
