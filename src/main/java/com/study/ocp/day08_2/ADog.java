package com.study.ocp.day08_2;

public abstract class ADog implements Dog {

	@Override
	public void eat() {
		System.out.println("吃狗飼料");
	}

}
