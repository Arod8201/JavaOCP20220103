package com.study.ocp.day15;

public class SportMain {

	public static void main(String[] args) {

		Walk walk = new Walk();
		Jogging jogging = new Jogging();

		Thread t1 = new Thread(walk, "John");
		Thread t2 = new Thread(jogging, "Mary");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.run(); // main 一條主程式跑(單工)
		t2.run();

//		Thread t3 = new Thread(() -> {
//			String name = "Mark";
//			String tName = Thread.currentThread().getName();
//			for (int i = 1; i <= 1000; i++) {
//				System.out.printf("%s 跑了 %d 步\n", name, i);
//			}
//		});

		t1.start();
		t2.start();
//		t3.start();

	}

}
