package com.study.ocp.day18;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto2 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		Thread.sleep(random.nextInt(5000));
		int n = random.nextInt(100);
		String tName = Thread.currentThread().getName();
		System.out.printf("%s -> %d\n", tName, n);
		return n;
	}

}
