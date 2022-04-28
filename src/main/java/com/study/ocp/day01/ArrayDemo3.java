package com.study.ocp.day01;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {

		int[] p1 = { 10, 20 };
		int[] p2 = { 30, 50 };
		// p1(10, 20), p2(30, 50)
		// 求二點間的距離

		// 1.
		double d = Math.sqrt(Math.pow((p1[0] - p2[0] + p1[1] - p2[1]), 2));
		System.out.printf("p1:%s p2:%s 兩點距離:%.2f\n", Arrays.toString(p1), Arrays.toString(p2), d);

		// 2.
		double dx = Math.pow(p1[0] - p2[0], 2);
		double dy = Math.pow(p1[1] - p2[1], 2);
		double dd = Math.sqrt(dx + dy);
		System.out.printf("p1:%s p2:%s 兩點距離:%.2f\n", Arrays.toString(p1), Arrays.toString(p2), dd);

	}

}
