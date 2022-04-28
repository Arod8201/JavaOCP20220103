package com.study.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci_Java8_2{

	public static void main(String[] args) {

		// Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);
		// 設定私有池大小
		int proc = Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool = new ForkJoinPool(proc);
		int a = 3;
		
		ForkJoinTask<Long> task = pool.submit(() -> {
			List<Long> fib = Stream.iterate(new long[] {0,1}, n -> new long[] {n[1], n[0] + n[1]})
							   .parallel()
							   .limit(a+1)
							   .peek(n -> System.out.println(Arrays.toString(n)))
							   .map(n -> n[0])
							   .collect(Collectors.toList());
			return fib.get(a);
		});
		
		try {
			System.out.printf("第 %d 項 = %d\n", a, task.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally {
			pool.shutdown();
		}
		
		int poolSize = pool.getPoolSize();
		System.out.println("poolSize: " + poolSize);
				
	}

}
