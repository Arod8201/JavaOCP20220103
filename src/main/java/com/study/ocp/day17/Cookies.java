package com.study.ocp.day17;

public class Cookies {

	private boolean empty = true;

	public synchronized void put(int i) {
		String tName = Thread.currentThread().getName();

		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.printf("%s 放了第 %d 餅乾\n", tName, i); // 放餅乾
		empty = false; // 放完了(盤子有餅乾)
		notifyAll(); // 呼叫小狗
	}

	public synchronized void eat(int i) {
		String tName = Thread.currentThread().getName();

		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.printf("%s 吃了第 %d 餅乾\n", tName, i); // 吃餅乾
		System.out.println();
		empty = true; // 吃完了
		notifyAll(); // 呼叫主人
	}

}
