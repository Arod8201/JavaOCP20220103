package com.study.ocp.day11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> nums = new Stack<>();
		nums.push(80);
		nums.push(90);
		nums.push(100);
		System.out.println(nums);
		System.out.println("============");

		int sum = 0;
		while (!nums.isEmpty()) {
			int num = nums.pop();
			System.out.println(num);
			sum += num;
		}
		System.out.println("============");
		System.out.println(sum);
		System.out.println(nums);
	}

}
