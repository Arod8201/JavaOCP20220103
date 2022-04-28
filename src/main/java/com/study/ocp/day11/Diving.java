package com.study.ocp.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Diving {

	public static void main(String[] args) {

		// 10, 8, 7, 6, 5, 9, 9, 5, 8, 7
		// 刪除最高與最低的 二個分數
		// 求平均(小數點一位)
		// Arrays.asList 不可變動除度的集合
		List<Integer> list = Arrays.asList(10, 8, 7, 6, 5, 9, 9, 5, 8, 7);
		System.out.println("排序前: " + list);

		Collections.sort(list);
		System.out.println("排序後: " + list);
		System.out.println("==================================");

		// 轉為可變動集合 , 例如: ArrayList
		List<Integer> list2 = new ArrayList<>(list);
		list2.remove(0);
		list2.remove(0);
		list2.remove(list2.size() - 1);
		list2.remove(list2.size() - 1);
		System.out.println(list2);

		double avg = list2.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
		System.out.printf("平均: %.1f\n", avg);

	}

}
