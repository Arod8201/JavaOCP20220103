package com.study.ocp.day20;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class Lotto implements Runnable {

	private String username;
	private static final ReentrantLock lock = new ReentrantLock();

	public Lotto(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		try {
			lock.lock(); // 嘗試鎖定
			for (int i = 1; i <= 5; i++) {
				System.out.printf("%s 得到第 %d 組號碼: %d\n", username, i, new Random().nextInt(100));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock(); // 解鎖
		}
	}

}

public class ReentrantLockDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(new Lotto("Arod"));
		service.execute(new Lotto("Asami"));
		service.shutdown();

	}

}
