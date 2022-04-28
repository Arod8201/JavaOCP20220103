package com.study.ocp.day15;

public class USD implements Runnable {

	private Box box;

	public USD(Box box) {
		this.box = box;
	}

	@Override
	public void run() {
		double exchange = 28.35;
		System.out.printf("USD exchange %.1f\n", exchange);
		box.setValue(exchange);
	}

}
