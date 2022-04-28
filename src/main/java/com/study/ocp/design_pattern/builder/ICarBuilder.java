package com.study.ocp.design_pattern.builder;

public interface ICarBuilder {

	CarBuilder setWheel(int wheel);

	CarBuilder setDoor(int door);

	CarBuilder setCC(int cc);

	CarBuilder setColor(String color);

	Car create();

}
