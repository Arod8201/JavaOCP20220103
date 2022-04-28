package com.study.ocp.day03;

public class StringAndStringBuilder {

	public static void append(String str) {
		str = str.concat("8"); // 相當於 str = str + "8"
	}

	public static String add(String str) {
		str = str.concat("8");
		return str;
	}

	public static void append(StringBuilder sd) {
		sd.append("8");
	}

	public static void main(String[] args) {

		String str = "Java";
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("str = " + str);
		System.out.println("sb = " + sb);
		append(str);
		append(sb);
		System.out.println("str = " + str);
		System.out.println("sb = " + sb);
		str = add(str);
		System.out.println("str = " + str);

	}

}
