package com.study.ocp.day08_3;

public class Fighter extends Airplane implements Weapon {

	@Override
	public void shoot() {
		System.out.println("戰鬥機發射精靈導彈");
	}

	@Override
	public void speed() {
		System.out.println("戰鬥機時速 1500/H KM");
	}

}
