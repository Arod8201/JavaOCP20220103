package com.study.ocp.design_pattern.decorator.sidedish;

import com.study.ocp.design_pattern.decorator.Food;

public class Ham extends SideDish {

	public Ham(Food food) {
		super(food);
		name = "火腿";
		price = 30;
	}

}
