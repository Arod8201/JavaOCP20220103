package com.study.ocp.day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindWordCountByLength {

	public static void main(String[] args) {

		// 印出每個長度的單字數量
		Path path = Paths.get("src/main/java/com/study/ocp/day23/words.txt");
		try (Stream<String> lines = Files.lines(path)) {

			lines.collect(Collectors.groupingBy(String::length, Collectors.counting()))
				 .forEach((k, v) -> System.out.println(k + " : " + v));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("================");
		System.out.println("數量由大到小排序");
		
		try (Stream<String> lines = Files.lines(path)) {
			
			lines.collect(Collectors.groupingBy(String::length,Collectors.counting()))
				 .entrySet()
				 .stream()
				 .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				 .forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
