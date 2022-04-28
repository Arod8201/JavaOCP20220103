package com.study.ocp.design_pattern.builder;

public class CarBuilder implements ICarBuilder {

	// 預設值
	private int wheel = 4;
	private int door = 2;
	private int cc = 2000;
	private String color = "Black";

	@Override
	public CarBuilder setWheel(int wheel) {
		this.wheel = wheel;
		return this;
	}

	@Override
	public CarBuilder setDoor(int door) {
		this.door = door;
		return this;
	}

	@Override
	public CarBuilder setCC(int cc) {
		this.cc += cc; // this.cc = cc;
		return this;
	}

	@Override
	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}

	@Override
	public Car create() {
		return new Car(wheel, door, cc, color);
	}

}
