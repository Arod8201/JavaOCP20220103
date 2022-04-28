package com.study.ocp.day10;

import java.util.Set;
import java.util.TreeSet;

public class SetExamDemo3 {

	public static void main(String[] args) {

		String name1 = "John";
		Exam[] exam1 = { new Exam("A", 100), new Exam("B", 90), new Exam("C", 80) };
		String name2 = "Mary";
		Exam[] exam2 = { new Exam("A", 100), new Exam("B", 100), new Exam("C", 100) };
		String name3 = "Helen";
		Exam[] exam3 = { new Exam("A", 70), new Exam("B", 60), new Exam("C", 50) };

		Student.desc = true;
		Set<Student> students = new TreeSet<>();
		students.add(new Student(name1, exam1));
		students.add(new Student(name2, exam2));
		students.add(new Student(name3, exam3));

		// 請排名:
		students.stream().forEach(s -> System.out.println(s.getName()));

	}

}
