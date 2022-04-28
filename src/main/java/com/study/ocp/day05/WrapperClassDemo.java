package com.study.ocp.day05;

public class WrapperClassDemo {

	public static void main(String[] args) {

		// 取最大值
		int max = Integer.MAX_VALUE;
		System.out.printf("int 的最大值: %d\n", max);
		System.out.println();

		// 數值比較
		int a = 10;
		int b = 20;
		System.out.printf("a: %d, b: %d 最大的是: %d\n", a, b, Integer.max(a, b));
		System.out.println();

		// 資料轉換 String 轉數字
		String s1 = "100";
		String s2 = "200";
		System.out.println(s1 + " " + s2);
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

	}

}
