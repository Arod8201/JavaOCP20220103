package com.study.ocp.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Map<String, Integer>> {

	private String name;

	public Lotto(String name) {
		this.name = name;
	}

	@Override
	public Map<String, Integer> call() throws Exception {
		Map<String, Integer> map = new HashMap<>();
		Thread.sleep(new Random().nextInt(100));
		map.put(name, new Random().nextInt(100));
		return map;
	}

}
