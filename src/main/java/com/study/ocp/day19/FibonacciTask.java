package com.study.ocp.day19;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Long> {

	final static int THRESHOLD = 29;
	private int num;

	public FibonacciTask(int num) {
		this.num = num;
	}

	@Override
	protected Long compute() {
		if (num < THRESHOLD) {
			return new Fibonacci().fib(num);
		}
		FibonacciTask subTask1 = new FibonacciTask(num - 1);
		FibonacciTask subTask2 = new FibonacciTask(num - 2);
		invokeAll(subTask1, subTask2);
		long subResult1 = subTask1.join();
		long subResult2 = subTask2.join();
		long result = subResult1 + subResult2;
		return result;
	}

}
