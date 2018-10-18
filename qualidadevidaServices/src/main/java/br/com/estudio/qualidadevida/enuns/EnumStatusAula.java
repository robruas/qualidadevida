package br.com.estudio.qualidadevida.enuns;

public enum EnumStatusAula {

	AGENDADA("A"),AULA_REALIZADA("D"), REMARCADA("R");

	private String status;

	EnumStatusAula(String status) {
		this.status = status;
	}

	public static EnumStatusAula getEnumStatusAula(final String status) {
		EnumStatusAula enumStatusAula = null;

		for (EnumStatusAula statusAula : EnumStatusAula.values()) {
			if (status.equals(statusAula.getStatus())) {
				enumStatusAula = statusAula;
				break;
			}
		}

		return enumStatusAula;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

}
