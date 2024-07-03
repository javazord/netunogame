package br.com.game.netuno.e;

public enum EEyesColor {

	PRETO("Preto"), CASTANHO("Castanho"), AZUL("Azul"), VERDE("Verde");

	private final String descricao;

	EEyesColor(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EEyesColor fromCode(int code) {
		switch (code) {
		case 1:
			return PRETO;
		case 2:
			return CASTANHO;
		case 3:
			return AZUL;
		case 4:
			return VERDE;
		default:
			throw new IllegalArgumentException("Código de cor de olhos inválido: " + code + "\n");
		}
	}

}
