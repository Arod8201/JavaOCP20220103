package com.study.ocp.day10;

import java.util.Set;
import java.util.TreeSet;

public class SetExamDemo2 {

	public static void main(String[] args) {

		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("英文", 80);
		Exam e3 = new Exam("數學", 90);
		Exam e4 = new Exam("國文", 100);
//		Exam e1 = new Exam("Chinese", 100);
//		Exam e2 = new Exam("English", 80);
//		Exam e3 = new Exam("Math", 90);
//		Exam e4 = new Exam("Chinese", 100);

		Set<Exam> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("========================================");

	}

}
