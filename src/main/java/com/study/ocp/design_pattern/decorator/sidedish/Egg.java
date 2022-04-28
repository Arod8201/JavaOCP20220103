package com.study.ocp.design_pattern.decorator.sidedish;

import com.study.ocp.design_pattern.decorator.Food;

public class Egg extends SideDish {

	public Egg(Food food) {
		super(food);
		name = "雞蛋";
		price = 10;
	}

}
