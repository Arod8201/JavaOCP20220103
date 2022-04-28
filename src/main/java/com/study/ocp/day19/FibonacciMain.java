package com.study.ocp.day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class FibonacciMain {

	public static void main(String[] args) {

		int num = 45;
		long statTime, endTime, result;

		// Recursive
		statTime = System.currentTimeMillis();
		result = new Fibonacci().fib(num);
		endTime = System.currentTimeMillis();
		System.out.printf("Recursive fib(%d) = %d in %d ms\n", num, result, (endTime - statTime));

		// ForkJoin
		ForkJoinTask<Long> task = new FibonacciTask(num);
		int proc = Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool = new ForkJoinPool(proc);
		statTime = System.currentTimeMillis();
		result = pool.invoke(task);
		endTime = System.currentTimeMillis();
		System.out.printf("ForkJoin fib(%d) = %d in %d ms\n", num, result, (endTime - statTime));

	}

}
