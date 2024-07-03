package br.com.game.netuno.screen;

import java.util.Scanner;

import br.com.game.netuno.entity.Character;
import br.com.game.netuno.entity.User;
import br.com.game.netuno.print.CreateCharacter;
import br.com.game.netuno.print.CreateMount;
import br.com.game.netuno.print.EndGame;

public class TelaJogo {

	private static Character character;

	public static void exibir(User user) {
		character = new Character();
		Scanner read = new Scanner(System.in);

		System.out.println("----------------------------------------------");
		System.out.println("|                    JOGO                    |");
		System.out.println("----------------------------------------------");
		System.out.println(user.getName().toUpperCase() + " BEM VINDO(A) AO GAME NETUNO!\n");

		CreateCharacter.create(read, character);
		CreateMount.create(read, character);
		EndGame.endGame(character);

	}
}
