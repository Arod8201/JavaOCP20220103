package com.study.ocp.day12;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("國文", 100);
		map.put("英文", 100);
		map.put("數學", 90);
		map.putIfAbsent("數學", 80); // 若s key 值不存在才加入
		map.put("數學", 70); // 若 key 值存在會覆蓋
		System.out.println(map);
		System.out.println("=============================");

		// 取得所有 key
		// [國文, 英文, 數學]
		Set<String> keys = map.keySet();
		System.out.println("所有 key: " + keys);

		// 取得所有 value
		// [100, 100, 70]
		Collection<Integer> values = map.values();
		System.out.println("所有 value: " + values);
		System.out.println("=============================");

		// 取得 key=value 的組合 -> entrySet
		// [國文=100, 英文=100, 數學=70]
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("key=value 組合: " + entrySet);
		System.out.println("=============================");

		// 輪詢-透過 key 來取得 value
		for (String key : keys) {
			System.out.println(key + " = " + map.get(key));
		}
		System.out.println("=============================");

		// 輪詢-透過 entrySet 來取得 key=value 的組合
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("=============================");

		// 輪詢-Java 8 stream
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
		System.out.println("=============================");

		//
		System.out.println(map.containsKey("國文")); // key 是否有國文 ?
		System.out.println(map.containsValue(100)); // value 是否有 100 ?

	}

}
