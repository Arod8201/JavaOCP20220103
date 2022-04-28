package com.study.ocp.day07.drinkstore;

public class Coffee implements Drink {

	private String name = "美式咖啡";
	private Integer price = 75;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}

}
