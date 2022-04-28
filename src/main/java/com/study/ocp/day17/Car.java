package com.study.ocp.day17;

import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {

	private CyclicBarrier cyclicBarrier;

	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 從台北出發\n", tName);

		try {
			Thread.sleep(5000);
			System.out.printf("%s 到台中了\n", tName);
			cyclicBarrier.await();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.printf("%s 繼續往高雄出發 ...\n", tName);
	}

}
