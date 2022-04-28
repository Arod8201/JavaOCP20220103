package com.study.ocp.day10;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();
		set.add(5);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(9);
		set.add(6);
		set.add(8);
		System.out.println(set);

	}

}
