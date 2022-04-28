package com.study.ocp.day16;

public class Father extends Thread {

	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");

		Worker worker = new Worker();
		worker.start();

		try {
			// join 可以設定最大等候時間
			worker.join(10_000);
			// 要了解 join() 與 sleep() 的差異
			// sleep() 會等到時間完畢之後才會工作
			// Thread.sleep(10_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
	}

	// 測試
	public static void main(String[] args) {
		new Father().start();
	}

}
