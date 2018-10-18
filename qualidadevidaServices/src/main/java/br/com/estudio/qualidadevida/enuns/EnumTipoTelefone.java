package br.com.estudio.qualidadevida.enuns;

public enum EnumTipoTelefone {

	COMERCIAL("C"), RESIDENCIAL("R"), CELULAR("L");

	private String tipo;

	EnumTipoTelefone(String tipo) {
		this.tipo = tipo;
	}

	public static EnumTipoTelefone getEnumTipoTelefone(final String tipo) {
		EnumTipoTelefone tipoTelefoneEnum = null;

		for (EnumTipoTelefone enumTipoTelefone : EnumTipoTelefone.values()) {
			if (tipo.equals(enumTipoTelefone.getTipo())) {
				tipoTelefoneEnum = enumTipoTelefone;
				break;
			}
		}

		return tipoTelefoneEnum;
	}

	public String getTipo() {
		return tipo;
	}

}
