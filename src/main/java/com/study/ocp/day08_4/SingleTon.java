package com.study.ocp.day08_4;

import java.util.Random;

public class SingleTon {

	private int num;
	private static SingleTon instance = new SingleTon();

	private SingleTon() {
		num = new Random().nextInt(1000);
	}

	public static SingleTon getInstance() {
		return instance;
	}

	public int getNum() {
		return num;
	}

}
