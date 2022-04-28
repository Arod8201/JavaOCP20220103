package com.study.ocp.day12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("A", 100);
		map.put("B", 50);
		map.put("C", 80);
		map.put("D", 40);
		map.put("E", 90);
		
		// Map -> stream -> filter -> String
		// 及格科目有 ?
		String result = map.entrySet()
						   .stream()
						   .filter(x -> x.getValue() >=60)
						   .map(Map.Entry::getKey) // 等同於 (x -> x.getKey())
						   .collect(Collectors.joining());
		System.out.println("及格科目: " + result);
		System.out.println("====================================");

		// Map -> stream -> filter -> Map part I
		Map<String, Integer> passMap = map.entrySet()
										  .stream()
										  .filter(x -> x.getValue() >= 60)
										  .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		System.out.println("及格科目和分數: " + passMap);
		System.out.println("====================================");
		
		// Map -> stream -> filter -> Map part II
		Map<String, Integer> passMap2 = map.entrySet()
									   	   .stream()
									   	   .filter(x -> x.getValue() >= 60)
									   	   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("及格科目和分數: " + passMap2);
		System.out.println("====================================");

	}

}
