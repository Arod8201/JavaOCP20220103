package com.study.ocp.java8_1z0_808.lesson_1.test15;

public class Test {

	public static void main(String[] args) {

		Test item = new Test();
		item.a1 = 11;
		StringBuilder sb = new StringBuilder("Hello"); // Hello Hello
		Integer i = 10;

		doProduct(i);
		doString(sb);
		doProduct(item.a1);

		System.out.println(i + " " + sb + " " + item.a1);

	}

	int a1; // 11

	public static void doProduct(int a) {
		a = a * a; // 100 // 121
	}

	public static void doString(StringBuilder s) {
		s.append(" " + s); // Hello Hello
	}

}
