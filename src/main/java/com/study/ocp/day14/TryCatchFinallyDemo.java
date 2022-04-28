package com.study.ocp.day14;

import java.util.Random;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {

		Random r = new Random();

		try {

			int score = r.nextInt(100);
			System.out.println("分數: " + score);
			if (score < 60) {
				// 自行新增一個例外物件
				ArithmeticException ae = new ArithmeticException("不及格");
				// 拋出此例外物件
				throw ae;
			}

		} finally {
			System.out.println("檔案關閉");
		}

	}

}
