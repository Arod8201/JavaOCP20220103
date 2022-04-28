package com.study.ocp.day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class FindTop10 {

	public static void main(String[] args) {

		// 找出 word.txt 字典內最長的 10 個單字
		Path path = Paths.get("src/main/java/com/study/ocp/day23/words.txt");

		try (Stream<String> lines = Files.lines(path)) {

			lines.filter(w -> w.length() > 20)
				 .sorted(Comparator.comparingInt(String::length).reversed()).limit(10)
				 .forEach(w -> System.out.printf("%s (%d)%n", w, w.length()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
