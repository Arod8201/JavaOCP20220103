package com.study.ocp.day18;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class MyLottoThreadPoolMain {

	public static void main(String[] args) throws Exception {

		//ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);
		
		Future<Integer> t1 = exec.submit(new Lotto2());
		
		System.out.println(t1.get());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());

		Thread.sleep(5000);
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());

		System.out.println("Thread count: " + Thread.activeCount());
		exec.shutdown();

	}

}
