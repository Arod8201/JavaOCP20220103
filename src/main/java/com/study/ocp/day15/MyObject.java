package com.study.ocp.day15;

class MyBook {
	// 建構子
	public MyBook() {
		String tName = Thread.currentThread().getName();
		System.out.println("執行者 : " + tName);
		System.out.println("MyBook 建構子");
	}

	@Override
	protected void finalize() throws Throwable {
		String tName = Thread.currentThread().getName();
		System.out.println("執行者 : " + tName);
		System.out.println("MyBook 解構子");
	}

}

public class MyObject {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().freeMemory());
		MyBook myBook = new MyBook();
		myBook = null;
		System.gc();
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
