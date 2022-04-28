package com.study.ocp.day11;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> strList = new LinkedList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		System.out.println(strList);
		strList.remove("A");
		System.out.println(strList);
		System.out.println("===================");

		List<Integer> intList = new LinkedList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
		// intList.remove(1); // 移除 index = 1 位置的元素
		intList.remove(Integer.valueOf(1)); // 移除 Integer = 1 內容的元素
		System.out.println(intList);
	}

}
