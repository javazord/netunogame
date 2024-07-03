package br.com.game.netuno.entity;

import br.com.game.netuno.e.EClasse;
import br.com.game.netuno.e.EEyesColor;
import br.com.game.netuno.e.EHairColor;
import br.com.game.netuno.e.EMuscleLevel;
import br.com.game.netuno.e.ESkinColor;

public class Character {

	private EClasse classe;
	private EHairColor hairColor;
	private ESkinColor skinColor;
	private EEyesColor eyesColor;
	private EMuscleLevel muscleLevel;
	private String tools;
	private Mount mount;
	private Integer life, mana;
	private float attackSpeed;

	public EClasse getClasse() {
		return classe;
	}

	public void setClasse(EClasse classe) {
		this.classe = classe;
	}

	public EHairColor getHairColor() {
		return hairColor;
	}

	public void setHairColor(EHairColor hairColor) {
		this.hairColor = hairColor;
	}

	public ESkinColor getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(ESkinColor skinColor) {
		this.skinColor = skinColor;
	}

	public EEyesColor getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(EEyesColor eyesColor) {
		this.eyesColor = eyesColor;
	}

	public EMuscleLevel getMuscleLevel() {
		return muscleLevel;
	}

	public void setMuscleLevel(EMuscleLevel muscleLevel) {
		this.muscleLevel = muscleLevel;
	}

	public Mount getMount() {
		return mount;
	}

	public void setMount(Mount mount) {
		this.mount = mount;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public float getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public void atrCharacter() {
		if (classe.equals(EClasse.PALADINO)) {
			this.setLife(90);
			this.setMana(40);
		}
		if (classe.equals(EClasse.ATIRADOR)) {
			this.setLife(85);
			this.setMana(35);
		}
		if (classe.equals(EClasse.GUERREIRO)) {
			this.setLife(95);
			this.setMana(30);
		}
		if (classe.equals(EClasse.BARBARO)) {
			this.setLife(95);
			this.setMana(35);
		}
		if (classe.equals(EClasse.ARQUEIRO)) {
			this.setLife(80);
			this.setMana(50);
		}
	}

	public void addAttack() {
		if (muscleLevel.equals(EMuscleLevel.MUITOMAGRO)) {
			this.setAttackSpeed(1.5F);
		}
		if (muscleLevel.equals(EMuscleLevel.MAGRO)) {
			this.setAttackSpeed(1.3F);
		}
		if (muscleLevel.equals(EMuscleLevel.FORTE)) {
			this.setAttackSpeed(1.0F);
		}
		if (muscleLevel.equals(EMuscleLevel.MUITOFORTE)) {
			this.setAttackSpeed(0.8F);
		}
		if (muscleLevel.equals(EMuscleLevel.INCRIVELMENTEFORTE)) {
			this.setAttackSpeed(0.5F);
		}
	}

}
