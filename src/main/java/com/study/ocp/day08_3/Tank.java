package com.study.ocp.day08_3;

public class Tank extends Car implements Weapon {

	@Override
	public void shoot() {
		System.out.println("坦克發射砲彈");
	}

	@Override
	public void move() {
		System.out.println("坦克用履帶走");
	}

}
