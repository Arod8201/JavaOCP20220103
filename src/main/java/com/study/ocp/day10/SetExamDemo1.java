package com.study.ocp.day10;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamDemo1 {

	public static void main(String[] args) {

		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("英文", 80);
		Exam e3 = new Exam("數學", 90);
		Exam e4 = new Exam("國文", 100);

		Set<Exam> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("========================================");

		// 最高分是哪一科 ?
		// 最低分是哪一科 ?

		/*
		   @FunctionalInterface public interface Comparator<T> { 
		   		int compare(T o1, T o2);
		   }
		*/
		
		// Java 8 方法1 :
		String max = set.stream().max(Comparator.comparing(Exam::getScore)).get().getName();
		System.out.printf("最高分 = %s\n", max);
		
		String min = set.stream().min(Comparator.comparing(Exam::getScore)).get().getName();
		System.out.printf("最低分 = %s\n",min);
		System.out.println("========================================");

		// Java 8 方法2 :
		Exam max2 = set.stream().max((o1 , o2) -> o1.getScore() - o2.getScore()).get();
		System.out.printf("最高分 = %s\n", max2.getName());
		
		Exam min2 = set.stream().min((o1 , o2) -> o1.getScore() - o2.getScore()).get();
		System.out.printf("最低分 = %s\n",min2.getName());
		System.out.println("========================================");
		
		// Java 8 方法3 :
		Exam max3 = set.stream().max(Comparator.comparing(e -> e.getScore())).get();
		System.out.printf("最高分 = %s\n",max3.getName());
		
		Exam min3 = set.stream().min(Comparator.comparing(e -> e.getScore())).get();
		System.out.printf("最低分 = %s\n",min3.getName());
	}
}
