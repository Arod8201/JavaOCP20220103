package com.study.ocp.day15;

public class StockMain {

	public static void main(String[] args) {

		Runnable job1 = new StockPrice();
		Runnable job2 = new StockNews();

		Thread t1 = new Thread(job1);
		Thread t2 = new Thread(job2);

		t1.start();
		t2.start();

	}

}
