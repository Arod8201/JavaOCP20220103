package com.study.ocp.java8_1z0_808.lesson_1.test38;

public class Test {

	public static void main(String[] args) {

		String[] x = { "TRUE", "null" };

		boolean a = new Boolean(Boolean.valueOf(x[0]));
		boolean b = new Boolean(x[1]);

		System.out.println(a + " " + b);

	}

}
