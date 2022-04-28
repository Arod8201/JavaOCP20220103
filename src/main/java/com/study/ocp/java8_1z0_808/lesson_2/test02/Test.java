package com.study.ocp.java8_1z0_808.lesson_2.test02;

public class Test {

	public static void main(String[] args) {

		int n[][] = { { 1, 3 }, { 2, 4 } };
		for (int i = n.length - 1; i >= 0; i--) {
			for (int y : n[i]) {
				System.out.print(y);
			}
		}

	}

}
