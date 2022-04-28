package com.study.ocp.day09;

public class PositionDemo {

	public static void main(String[] args) {
		printSalary(Position.副總);
		printSalary(Position.經理);
	}

	public static void printSalary(Position pos) {
		switch (pos) {
		case 一般員工:
			System.out.println("$40,000");
			break;
		case 經理:
			System.out.println("$70,000");
			break;
		case 副總:
			System.out.println("$100,000");
			break;
		case 總經理:
			System.out.println("$200,000");
			break;
		}
	}

}
