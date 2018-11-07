package br.com.estudio.qualidadevida.enuns;

public enum EnumTipoContato {

	COMERCIAL("C"), RESIDENCIAL("R"), CELULAR("L");

	private String tipo;

	EnumTipoContato(String tipo) {
		this.tipo = tipo;
	}

	public static EnumTipoContato getEnumTipoTelefone(final String tipo) {
		EnumTipoContato tipoTelefoneEnum = null;

		for (EnumTipoContato enumTipoTelefone : EnumTipoContato.values()) {
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
