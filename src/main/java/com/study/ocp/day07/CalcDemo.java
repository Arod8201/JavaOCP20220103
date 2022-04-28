package com.study.ocp.day07;

public class CalcDemo {

//	public int add(int x, int y) {
//		System.out.println("A");
//		return x + y;
//	}
//
//	public int add(int x, int y, int z) {
//		System.out.println("A");
//		return x + y + z;
//	}

	public int add(int... nums) {
		System.out.println("C");
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		CalcDemo calc = new CalcDemo();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(10, 20, 30));
		System.out.println("==================");

		int[] nums = { 10, 20, 30, 40, 50 };
		System.out.println(calc.add(nums));
		System.out.println(calc.add());

	}

}
