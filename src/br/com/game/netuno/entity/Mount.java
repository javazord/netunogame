package br.com.game.netuno.entity;

import br.com.game.netuno.e.EMount;

public class Mount {

	private EMount typeMount;
	private Integer speed, rest;

	public EMount getTypeMount() {
		return typeMount;
	}

	public void setTypeMount(EMount typeMount) {
		this.typeMount = typeMount;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getRest() {
		return rest;
	}

	public void setRest(Integer rest) {
		this.rest = rest;
	}

	public void atrMount() {
		if (typeMount.equals(EMount.CAVALO)) {
			this.setSpeed(3);
			this.setRest(5);
		}
		if (typeMount.equals(EMount.PANDA)) {
			this.setSpeed(2);
			this.setRest(3);
		}
		if (typeMount.equals(EMount.URSO)) {
			this.setSpeed(2);
			this.setRest(3);
		}
		if (typeMount.equals(EMount.JAGUAR)) {
			this.setSpeed(5);
			this.setRest(7);
		}
		if (typeMount.equals(EMount.TIGRE)) {
			this.setSpeed(5);
			this.setRest(7);
		}
	}
}
