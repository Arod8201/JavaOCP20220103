package com.study.ocp.day08_4;

import java.util.Random;

public class Multition {

	private int num;
	private static Multition[] list = { new Multition(70000), new Multition(500), new Multition(-100) };

	private Multition(int num) {
		this.num = num;
	}

	public static Multition getInstance() {
		return list[new Random().nextInt(3)]; // list[0], list[1], list[2]
	}

	public int getNum() {
		return num;
	}

}
