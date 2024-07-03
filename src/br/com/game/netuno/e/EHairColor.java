package br.com.game.netuno.e;

public enum EHairColor {
	PRETO("Preto"), BRANCO("Branco"), CASTANHO("Castanho"), LOURO("Louro");

	private final String descricao;

	EHairColor(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EHairColor fromCode(int code) {
		switch (code) {
		case 1:
			return PRETO;
		case 2:
			return BRANCO;
		case 3:
			return CASTANHO;
		case 4:
			return LOURO;
		default:
			throw new IllegalArgumentException("Código de cor de cabelo inválido: " + code + "\n");
		}
	}
}
