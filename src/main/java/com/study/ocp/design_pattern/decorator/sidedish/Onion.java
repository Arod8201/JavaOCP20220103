package com.study.ocp.design_pattern.decorator.sidedish;

import com.study.ocp.design_pattern.decorator.Food;

public class Onion extends SideDish {

	public Onion(Food food) {
		super(food);
		name = "洋蔥";
		price = 7;
	}

}
