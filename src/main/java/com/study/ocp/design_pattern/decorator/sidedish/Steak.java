package com.study.ocp.design_pattern.decorator.sidedish;

import com.study.ocp.design_pattern.decorator.Food;

public class Steak extends SideDish {

	public Steak(Food food) {
		super(food);
		name = "牛排";
		price = 88;
	}

}
