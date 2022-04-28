package com.study.ocp.day15;

public class RaceMain {

	public static void main(String[] args) {

		Race r1 = new Race();
		Race r2 = new Race();

		r1.setName("Rabbit");
		r2.setName("Turtle");

		r1.setPriority(Thread.MIN_PRIORITY); // 1
		r2.setPriority(Thread.MAX_PRIORITY); // 10

//		r1.run(); // main 一條主程式跑(單工)
//		r2.run();

		r1.start();
		r2.start();

	}

}
