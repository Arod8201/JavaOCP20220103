package com.study.ocp.design_pattern.decorator.sidedish;

import com.study.ocp.design_pattern.decorator.Food;

public class Tomato extends SideDish {

	public Tomato(Food food) {
		super(food);
		name = "番茄";
		price = 12;
	}

}
