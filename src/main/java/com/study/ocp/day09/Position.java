package com.study.ocp.day09;

public enum Position {

	一般員工, 經理, 副總, 總經理;

	private Position() {
		System.out.println("建構 Position");
	}

}
