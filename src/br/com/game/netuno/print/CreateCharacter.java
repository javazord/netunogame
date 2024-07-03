package br.com.game.netuno.print;

import java.util.Scanner;

import br.com.game.netuno.e.EClasse;
import br.com.game.netuno.e.EEyesColor;
import br.com.game.netuno.e.EHairColor;
import br.com.game.netuno.e.EMuscleLevel;
import br.com.game.netuno.e.ESkinColor;
import br.com.game.netuno.entity.Character;
import br.com.game.netuno.read.config.ReadConfig;

public class CreateCharacter {

	public static void create(Scanner read, Character character) {
		while (true) {
			try {
				CharacterCustomization.selectCharacter();
				character.setClasse(EClasse.fromCode(ReadConfig.readIntegerWithValidation(read)));
				character.atrCharacter();

				character.setTools(CharacterCustomization.choiceWeapon(read, character.getClasse()));

				CharacterCustomization.hairColor();
				character.setHairColor(EHairColor.fromCode(ReadConfig.readIntegerWithValidation(read)));

				CharacterCustomization.skinColor();
				character.setSkinColor(ESkinColor.fromCode(ReadConfig.readIntegerWithValidation(read)));

				CharacterCustomization.eyesColor();
				character.setEyesColor(EEyesColor.fromCode(ReadConfig.readIntegerWithValidation(read)));

				CharacterCustomization.muscleLevel();
				character.setMuscleLevel(EMuscleLevel.fromCode(ReadConfig.readIntegerWithValidation(read)));
				character.addAttack();
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println("Digite um número válido da lista acima.\n");
			}
		}

	}

}
