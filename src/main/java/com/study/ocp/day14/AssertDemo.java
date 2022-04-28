package com.study.ocp.day14;

public class AssertDemo {

	public static void main(String[] args) {

		int score = 10;
		assert score >= 60 : score + " 成績不及格";
		System.out.println(score + " 成績及格");

	}

}
