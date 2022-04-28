package com.study.ocp.day16;

public class Worker extends Thread {

	@Override
	public void run() {
		System.out.println("工人準備送瓦斯");
		for (int i = 1; i <= 5; i++) {
			// 模擬送瓦斯的時間
			try {
				Thread.sleep(1000);
				System.out.print(i + " 秒鐘 ");
			} catch (InterruptedException e) {
				System.out.println("發生意外 : " + e);
			}
		}
		System.out.println("\n瓦斯工人將瓦斯送到");
	}

}
