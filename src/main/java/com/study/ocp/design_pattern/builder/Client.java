package com.study.ocp.design_pattern.builder;

public class Client {

	public static void main(String[] args) {
		
		Car car = new CarBuilder()
				                  .setWheel(2)
				                  .setCC(5000)
				                  .setCC(3000)
				                  .setDoor(0)
				                  .setCC(500)
				                  .setColor("Red")
				                  .create();
		System.out.println(car);
		
		Car car2 = new CarBuilder()
								   .create();
		System.out.println(car2);

	}

}
