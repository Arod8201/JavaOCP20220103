package com.study.ocp.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(null);
		set.add(90);
		set.add(80);

		// 總分
		Iterator<Integer> iter = set.iterator();
		int sum = 0;
		while (iter.hasNext()) {
			Integer value = iter.next();
			if (value != null) {
				sum += value;
			}
		}
		System.out.println(sum);
	}

}
