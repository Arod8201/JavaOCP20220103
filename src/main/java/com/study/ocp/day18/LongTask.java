package com.study.ocp.day18;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LongTask implements Runnable {

	@Override
	public void run() {
		System.out.println("長任務 - 開始");

		try {
			TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("長任務 - 結束");
	}

}
