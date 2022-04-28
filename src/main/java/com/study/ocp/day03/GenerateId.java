package com.study.ocp.day03;

import java.util.Random;

//身分證字號產生器
public class GenerateId {

	public static boolean checkId(String id) {

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

		// 驗證
		int[] m = { 1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1 };
		int sum = 0;
		// nums 與 m 依序相乘
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i] * m[i];
		}
		return sum % 10 == 0;
	}

	public static void main(String[] args) {

		Random r = new Random();
		while (true) {
			String id = "A" + (r.nextInt(2) + 1) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10)
					+ r.nextInt(10) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10);
			if (checkId(id)) {
				System.out.println(id);
				break;
			}
			
		}

	}

}
