package br.com.game.netuno.e;

public enum ESkinColor {

	PALIDA("Pálida"), PARDO("Pardo"), BRANCO("Branco"), NEGRO("Negro");

	private final String descricao;

	ESkinColor(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public static ESkinColor fromCode(int code) {
		switch (code) {
		case 1:
			return PALIDA;
		case 2:
			return PARDO;
		case 3:
			return BRANCO;
		case 4:
			return NEGRO;
		default:
			throw new IllegalArgumentException("Código de cor de pele inválido: " + code + "\n");
		}
	}

}
