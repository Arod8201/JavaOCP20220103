package com.study.ocp.day19;

public class Fibonacci {

	public long fib(int n) {
		// return n < 2 ? n: fib(n-1) + fib(n-2);
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
