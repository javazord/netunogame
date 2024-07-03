package br.com.game.netuno.print;

import br.com.game.netuno.entity.Character;

public class EndGame {

	public static void endGame(Character character) {
		System.out.println("\n");
		System.out.println("Personalização Concluída!");
		System.out.println("### ATRIBUTOS DO AVATAR ###");
		System.out.println("Classe:" + character.getClasse());
		System.out.println("Cor do cabelo: " + character.getHairColor());
		System.out.println("Cor dos olhos: " + character.getEyesColor());
		System.out.println("Cor da pele: " + character.getSkinColor());
		System.out.println("Ferramenta: " + character.getTools());
		System.out.println("Vida: " + character.getLife());
		System.out.println("Mana: " + character.getMana());
		System.out.println("Velocidade de ataque: " + character.getAttackSpeed());
		System.out.println("Nível muscular: " + character.getMuscleLevel().getDescricao());
		System.out.println("\n");
		System.out.println("### ATRIBUTOS DE MONTARIA ###");
		System.out.println("Montaria: " + character.getMount().getTypeMount());
		System.out.println("Velocidade: " + character.getMount().getSpeed() + "m/s, Tempo para descanso: "
				+ character.getMount().getRest() + " minutos");
	}

}
