package br.com.game.netuno.read.config;

import java.util.Scanner;

public class ReadConfig {

	public static int readIntegerWithValidation(Scanner read) {
		while (true) {
			try {
				return Integer.parseInt(read.next());
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				read.nextLine();
			}
		}
	}
}
