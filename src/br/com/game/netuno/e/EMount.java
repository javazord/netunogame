package br.com.game.netuno.e;

public enum EMount {

	CAVALO("Cavalo"), PANDA("Panda"), URSO("Urso"), JAGUAR("Jaguar"), TIGRE("Tigre");

	private final String descricao;

	EMount(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EMount fromCode(int code) {
		switch (code) {
		case 1:
			return CAVALO;
		case 2:
			return PANDA;
		case 3:
			return URSO;
		case 4:
			return JAGUAR;
		case 5:
			return TIGRE;
		default:
			throw new IllegalArgumentException("Código de montaria inválido: " + code + "\n");
		}
	}

}
