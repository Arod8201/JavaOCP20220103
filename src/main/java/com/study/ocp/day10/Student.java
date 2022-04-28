package com.study.ocp.day10;

import java.util.Arrays;

public class Student implements Comparable<Student> {

	public static boolean desc;
	private String name;
	private Exam[] exams = new Exam[3];

	public Student() {
	}

	public Student(String name, Exam[] exams) {
		this.name = name;
		this.exams = exams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", exams = " + Arrays.toString(exams) + "]";
	}

	@Override
	public int compareTo(Student o) {
		int sum1 = Arrays.stream(exams).mapToInt(Exam::getScore).sum();
		int sum2 = Arrays.stream(o.exams).mapToInt(Exam::getScore).sum();
		return (sum1 - sum2) * (desc ? -1 : 1);
	}

}
