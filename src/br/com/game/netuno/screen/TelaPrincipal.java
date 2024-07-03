package br.com.game.netuno.screen;

import br.com.game.netuno.entity.User;
import br.com.game.netuno.print.CreateUser;

public class TelaPrincipal {

	private static User user;

	public static void main(String[] args) {

		System.out.println("----------------------------------------------");
		System.out.println("|                  CADASTRO                  |");
		System.out.println("----------------------------------------------");
		System.out.println("Faça o seu cadastro para começar o NETUNO GAME!");

		user = CreateUser.create();
		TelaLogin.exibir(user);
		TelaJogo.exibir(user);
	}

}