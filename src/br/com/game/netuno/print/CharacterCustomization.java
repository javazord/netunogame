package br.com.game.netuno.print;

import java.util.Scanner;

import br.com.game.netuno.e.EClasse;
import br.com.game.netuno.e.EEyesColor;
import br.com.game.netuno.e.EHairColor;
import br.com.game.netuno.e.EMuscleLevel;
import br.com.game.netuno.e.ESkinColor;
import br.com.game.netuno.read.config.ReadConfig;

public class CharacterCustomization {

	public static void selectCharacter() {
		int i = 1;
		EClasse[] classes = EClasse.values();
		System.out.println("Selecione uma classe para jogar:");
		for (EClasse classe : classes) {
			System.out.println("[" + i++ + "] - " + classe.getDescricao());
		}
	}

	public static void hairColor() {
		int i = 1;
		EHairColor[] hairColors = EHairColor.values();
		System.out.println("Escolha a cor do cabelo:");
		for (EHairColor hairColor : hairColors) {
			System.out.println("[" + i++ + "] - " + hairColor.getDescricao());
		}
	}

	public static void skinColor() {
		int i = 1;
		ESkinColor[] skinColors = ESkinColor.values();
		System.out.println("Escolha a cor da sua pele:");
		for (ESkinColor skinColor : skinColors) {
			System.out.println("[" + i++ + "] - " + skinColor.getDescricao());
		}
	}

	public static void eyesColor() {
		int i = 1;
		EEyesColor[] eyesColors = EEyesColor.values();
		System.out.println("Escolha a cor dos seus olhos:");
		for (EEyesColor eyesColor : eyesColors) {
			System.out.println("[" + i++ + "] - " + eyesColor.getDescricao());
		}
	}

	public static void muscleLevel() {
		int i = 1;
		EMuscleLevel[] muscleLevels = EMuscleLevel.values();
		System.out.println("Escolha o seu nível muscular:");
		for (EMuscleLevel muscleLevel : muscleLevels) {
			System.out.println("[" + i++ + "] - " + muscleLevel.getDescricao());
		}
	}

	public static String choiceWeapon(Scanner read, EClasse classe) {

		if (classe.equals(EClasse.PALADINO)) {
			System.out.println("Escolha sua arma:\n [1] - Lança\n [2] - Escudo");
			switch (ReadConfig.readIntegerWithValidation(read)) {
			case 1:
				return "Lança";
			case 2:
				return "Escudo";
			}
		}
		if (classe.equals(EClasse.ATIRADOR)) {
			return "Arma";
		}
		if (classe.equals(EClasse.GUERREIRO)) {
			return "Espada e Escudo";
		}
		if (classe.equals(EClasse.BARBARO)) {
			System.out.println("Escolha sua arma:\n [1] - Machado\n [2] - Marreta");
			switch (ReadConfig.readIntegerWithValidation(read)) {
			case 1:
				return "Machado";
			case 2:
				return "Marreta";
			}
		}
		return "Arco";
	}

}
