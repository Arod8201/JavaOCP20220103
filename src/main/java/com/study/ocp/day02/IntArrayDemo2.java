package com.study.ocp.day02;

import java.util.Arrays;

public class IntArrayDemo2 {

	public static void main(String[] args) {

		int[] nums = new int[] { 90, 40, 100, 55, 60 };
		System.out.println(Arrays.toString(nums));
		System.out.println("=========================");

		// 總和
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.printf("總和: %d\n", sum);
		System.out.println("=========================");

		// 平均
		double avg = (double) sum / nums.length;
		System.out.printf("平均: %.1f\n", avg);
		System.out.println("=========================");

		// 平方和累加
		double asum = 0;
		for (int i = 0; i < nums.length; i++) {
			asum += Math.pow(nums[i] - avg, 2);
		}
		System.out.printf("平方和: %.1f\n", asum);
		System.out.println("=========================");

		// sd 標準差
		double sd = Math.sqrt(asum / nums.length);
		System.out.printf("標準差: %.1f\n", sd);

	}

}
