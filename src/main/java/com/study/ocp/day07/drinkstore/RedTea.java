package com.study.ocp.day07.drinkstore;

public class RedTea implements Drink {

	private String name = "紅茶";
	private Integer price = 20;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}

	public void how2make() {
		System.out.println("開水煮紅茶");
	}

}
