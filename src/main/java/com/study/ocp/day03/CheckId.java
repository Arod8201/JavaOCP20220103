package com.study.ocp.day03;

import java.util.Arrays;
import java.util.Scanner;

public class CheckId {

	public static void main(String[] args) {

		System.out.print("請輸入身份證字號: ");
		Scanner sc = new Scanner(System.in); // 等同於 String id = new Scanner(System.in).next();
		String id = sc.next();
		System.out.println(id);

		int[] nums = new int[11];
		for (int i = 1; i < id.length(); i++) {
			nums[i + 1] = id.charAt(i) - 48;
		}

		switch (id.charAt(0)) {
		case 'A':
			nums[0] = 1;
			nums[1] = 0;
			break;
		case 'F':
			nums[0] = 1;
			nums[1] = 5;
			break;
		}
		System.out.println(Arrays.toString(nums));

		// 驗證
		int[] m = { 1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1 };
		System.out.println(Arrays.toString(m));

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i] * m[i];
		}

		System.out.println(sum);
		System.out.println(sum % 10 == 0);

		sc.close();

	}

}
