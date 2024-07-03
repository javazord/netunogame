package br.com.game.netuno.print;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.game.netuno.entity.User;

public class CreateUser {
	private static User user;
	private static Scanner read;

	public static int idade(final LocalDate birthday) {
		return Period.between(birthday, LocalDate.now()).getYears();
	}

	public static User create() {
		read = new Scanner(System.in);
		user = new User();
		LocalDate date = null;
		boolean validDate = false;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Digite seu Nome completo: ");
		user.setName(read.nextLine());

		while (!validDate) {
			System.out.print("Digite sua data de nascimento, Ex: dd/MM/yyyy ");
			String birthday = read.nextLine();

			if (isDateFormatValid(birthday)) {
				try {
					date = LocalDate.parse(birthday, formatter);
					if (date.isBefore(LocalDate.now())) {
						validDate = true;
					} else {
						System.out.println("Data de nascimento deve ser antes da data atual.");
					}
				} catch (Exception e) {
					System.out.println("Data no formato inválido. Digite novamente.");
				}
			} else {
				System.out.println("Formato de data inválido. Digite novamente.");
			}
		}
		if (idade(date) >= 18) {
			System.out.print("Digite seu melhor e-mail: ");
			user.setEmail(read.next());

			do {
				System.out.println("Crie uma senha: ");
				user.setPassword(read.next());
				System.out.println("Digite a senha novamente: ");
				user.setRepeatPass(read.next());

				if (!user.getPassword().equals(user.getRepeatPass())) {
					System.out.println("As senhas não coincidem, tente novamente!");
				}
			} while (!user.getPassword().equals(user.getRepeatPass()));
		} else {
			System.out.println("Ah não " + user.getName() + "! Só é possível jogar se possuir maioridade.. :("
					+ "\nO jogo será finalizado!");
			System.exit(0);
		}

		return user;
	}

	public static void validEmailAndPassword(Scanner read, User user) {
		Integer passCount = 0;
		String typedEmail = "";
		String typedPass = "";
		do {
			passCount++;
			System.out.println("Informe seu e-mail: ");
			typedEmail = read.next();
			System.out.println("Informe sua senha: ");
			typedPass = read.next();
			if (passCount <= 3 && !user.getPassword().equals(typedPass) || !user.getEmail().equals(typedEmail)) {
				System.out.println("Email ou senha incorretos, tente novamente! Tentativas " + passCount + "/3");
			} else {
				break;
			}

		} while (passCount <= 3);
		if (passCount >= 3 && !user.getPassword().equals(typedPass)) {
			System.out.println("Você ultrapassou o limite de tentativas, o jogo será finalizado!");
			System.exit(0);
		}

	}

	public static boolean isDateFormatValid(String birthday) {
		return birthday.matches("\\d{2}/\\d{2}/\\d{4}");
	}

}
