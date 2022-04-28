package com.study.ocp.java8_1z0_808.lesson_1.test36;

public class Test {

	public static void main(String[] args) {

		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;

		// String s4 = (String) (s3 * s2); // 不成立

		// 解法1.
		String s4 = (s3 * s2) + "";
		// 解法2.
		String s5 = String.valueOf(s3 * s2); // 數值轉字串

		int x = Integer.parseInt(s5); // 字串轉數值

		System.out.println("Sum is " + s4);
		System.out.println("Sum is " + s5);
		System.out.println(x);

	}

}
