package com.study.ocp.day17;

import java.util.concurrent.CyclicBarrier;

public class CarMain {

	public static void main(String[] args) {

		int n = 3;

		Runnable job = () -> System.out.println("吃午餐");

		CyclicBarrier cyclicBarrier = new CyclicBarrier(n, job);

		for (int i = 0; i < n + 1; i++) {
			Thread t1 = new Thread(new Car(cyclicBarrier));
			t1.start();
		}

	}

}
