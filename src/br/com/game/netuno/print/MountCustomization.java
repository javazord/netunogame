package br.com.game.netuno.print;

import br.com.game.netuno.e.EMount;

public class MountCustomization {

	public static void selectMount() {
		int i = 1;
		EMount[] mounts = EMount.values();
		System.out.println("Selecione uma montaria para seu personagem:");
		for (EMount mount : mounts) {
			System.out.println("[" + i++ + "] - " + mount.getDescricao());
		}
	}

}
