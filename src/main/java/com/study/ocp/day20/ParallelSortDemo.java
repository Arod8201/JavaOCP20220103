package com.study.ocp.day20;

import java.util.Arrays;

public class ParallelSortDemo {

	public static void main(String[] args) {

		int[] nums = { 3, 6, 7, 2 };
		System.out.println("排序前: " + Arrays.toString(nums));

		Arrays.parallelSort(nums);
		System.out.println("排序後: " + Arrays.toString(nums));

	}

}
