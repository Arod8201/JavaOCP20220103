package com.study.ocp.day08_3;

import java.util.Arrays;

public class Army {

	public static void main(String[] args) {

		Tank tank = new Tank();
		Truck truck = new Truck();
		Fighter fighter = new Fighter();

		Car[] cars = { tank, truck };
		Airplane[] airplanes = { fighter };
		Weapon[] weapons = { tank, fighter };

		Object[] army = { cars, airplanes, weapons };
		System.out.println(army);

		// 試問加總有元素 5 個 要如何實作 ? Homework
		Arrays.stream(army).forEach(System.out::println);

	}

}
