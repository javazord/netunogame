package br.com.game.netuno.e;

public enum EClasse {

	PALADINO("Paladino(a) [lança e escudo]"), ATIRADOR("Atirador(a) [Arma]"),
	GUERREIRO("Guerreiro(a) [Espada e Escudo]"), BARBARO("Bárbaro(a) [Machado ou Marreta]"),
	ARQUEIRO("Arqueiro(a) [Arco]");

	private final String descricao;

	EClasse(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EClasse fromCode(int code) {
		switch (code) {
		case 1:
			return PALADINO;
		case 2:
			return ATIRADOR;
		case 3:
			return GUERREIRO;
		case 4:
			return BARBARO;
		case 5:
			return ARQUEIRO;
		default:
			throw new IllegalArgumentException("Código de classe inválido: " + code);
		}
	}

}
