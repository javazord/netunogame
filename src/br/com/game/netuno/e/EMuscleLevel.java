package br.com.game.netuno.e;

public enum EMuscleLevel {

	MUITOMAGRO("Muito Magro | Velocidade de Ataque: 1.5"), MAGRO("Magro | Velocidade de Ataque: 1.3"),
	FORTE("Forte | Velocidade de Ataque: 1.0"), MUITOFORTE("Muito Forte | Velocidade de Ataque: 0.8"),
	INCRIVELMENTEFORTE("Incrivelmente Forte | Velocidade de Ataque: 0.5");

	private final String descricao;

	EMuscleLevel(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EMuscleLevel fromCode(int code) {
		switch (code) {
		case 1:
			return MUITOMAGRO;
		case 2:
			return MAGRO;
		case 3:
			return FORTE;
		case 4:
			return MUITOFORTE;
		case 5:
			return INCRIVELMENTEFORTE;
		default:
			throw new IllegalArgumentException("Código de nível muscular inválido: " + code + "\n");
		}
	}

}
