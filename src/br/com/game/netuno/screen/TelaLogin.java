package br.com.game.netuno.screen;

import java.util.Scanner;

import br.com.game.netuno.entity.User;
import br.com.game.netuno.print.CreateUser;

public class TelaLogin {

	public static void exibir(User user) {
		Scanner read = new Scanner(System.in);

		System.out.println("-----------------------------------------------");
		System.out.println("|                    LOGIN                    |");
		System.out.println("-----------------------------------------------");

		CreateUser.validEmailAndPassword(read, user);
	}

}
