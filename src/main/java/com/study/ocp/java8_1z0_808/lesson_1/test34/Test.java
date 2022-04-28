package com.study.ocp.java8_1z0_808.lesson_1.test34;

public class Test {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder(5); // (capacity) 預設開容量5 , 內容是空的
		String s = "";

		if (sb.equals(s)) { // 型態不同 , 比較一定是 false
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}

	}

}
