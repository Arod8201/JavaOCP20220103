package com.study.ocp.day12;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toMap;
import static java.util.function.Function.identity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// 分組 groupingBy
public class MapDemo3 {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "apple", "banana", "orange", "orange", "apple", "papaya",
				"watermelon");

		// 輸出: papaya=1, orange=2, banana=1, apple=3, watermelon=1
		// 1.
		Map<String, Long> result1 = fruits.stream()
										  .collect(groupingBy(x -> x, counting()));

		System.out.println(result1);
		System.out.println("======================================================");
		
		// 2.
		Map<String, Long> result2 = fruits.stream()
										  .collect(groupingBy(identity(),counting()));
		System.out.println(result2);
		System.out.println(result2.get("apple"));
		System.out.println("======================================================");

		// 輸出: apple=3, orange=2, watermelon=1, papaya=1, banana=1 (加入排序功能)
		// 排完之後要放到 Map<String, Long> srotedMap = new LinkedHashMap<>();
		
		//System.out.println("用 Key 排序: ");
		//result2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//System.out.println("用 Value 排序: ");
		//result2.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		Map<String, Long> sortedMap = new LinkedHashMap<>();
		result2.entrySet().stream()
						  .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // 反排序(要加上<String, Long>)
						  //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
						  .forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
		System.out.println("排序: " + sortedMap);
		System.out.println("======================================================");

		// 同學寫法
		// homework: think about (oldValue, newValue) -> oldValue ?
		Map<String,Long> newMap = result2.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	            .collect(toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(newMap);
		
	}

}
