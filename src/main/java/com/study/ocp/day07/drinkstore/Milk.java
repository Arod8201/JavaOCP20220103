package com.study.ocp.day07.drinkstore;

public class Milk implements Drink {

	private String name = "鮮乳";
	private Integer price = 40;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}

}
