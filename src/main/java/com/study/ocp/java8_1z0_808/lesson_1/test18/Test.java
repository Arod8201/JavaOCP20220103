package com.study.ocp.java8_1z0_808.lesson_1.test18;

public class Test {

	public static boolean isAvailable = false;

	public static void main(String[] args) {
		Test ts = new Test();
		System.out.println(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}

	public static boolean doStuff() {
		return !isAvailable;
	}

}
