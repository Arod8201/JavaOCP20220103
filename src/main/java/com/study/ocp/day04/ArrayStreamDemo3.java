package com.study.ocp.day04;

import java.util.Arrays;

//Java 8 陣列串流(Stream)
//串流(Stream) 可以做的有:
// 過濾(filter),轉換(map),分析/統計(statistics),蒐集(collect),逐筆呈現(foreach)
public class ArrayStreamDemo3 {

	public static void main(String[] args) {

		int[] nums = { 100, 80, 50, 70, 30 };

		// 請求出及格與不及格的平均各是多少 ?
		// 及格平均 ?
		double passAvg = Arrays.stream(nums).filter(n -> n >= 60).average().getAsDouble();
		System.out.printf("及格平均: %.1f\n", passAvg);

		// 不及格平均 ?
		double failAvg = Arrays.stream(nums).filter(n -> n < 60).average().getAsDouble();
		System.out.printf("不及格平均: %.1f\n", failAvg);

	}

}
