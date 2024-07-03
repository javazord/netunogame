package br.com.game.netuno.print;

import java.util.Scanner;

import br.com.game.netuno.e.EMount;
import br.com.game.netuno.entity.Character;
import br.com.game.netuno.entity.Mount;

public class CreateMount {
	private static Mount mount;

	public static void create(Scanner read, Character character) {
		mount = new Mount();
		try {
			MountCustomization.selectMount();
			mount.setTypeMount(EMount.fromCode(read.nextInt()));
			mount.atrMount();
			character.setMount(mount);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Digite um número válido da lista acima.\n");
		}

	}

}
