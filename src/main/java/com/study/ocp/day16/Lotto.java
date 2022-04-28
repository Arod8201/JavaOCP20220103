package com.study.ocp.day16;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 999999999; i++); // 模擬運算時間
		int number = new Random().nextInt(100) + 1;
		return number;
	}

}
