package com.study.ocp.day07;

public class Father {

	int money = 100;

	public Father() {
		this(100);
		System.out.println("A");
	}

	public Father(int x) {
		System.out.println("B");
	}

}
