package com.study.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelDemo {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9);
		IntStream intStream = nums.stream()
								  .sequential() // 轉換為循序運算
								  .peek(n -> System.out.printf("Thread name:%s n=%d\n",Thread.currentThread().getName(),n))
								  .mapToInt(n -> n * n)
								  .parallel(); // 轉換為平行運算
		
		int sum = intStream.sum();
		System.out.println(sum);
								  

	}

}
