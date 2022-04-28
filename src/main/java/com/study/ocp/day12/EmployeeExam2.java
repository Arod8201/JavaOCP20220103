package com.study.ocp.day12;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeExam2 {

	public static void main(String[] args) {

		Employee e1 = new Employee("A", "Aa", 100);
		Employee e2 = new Employee("B", "Bb", 100);
		Employee e3 = new Employee("C", "Cc", 100);

		Map<Employee, Integer> emps = new TreeMap<>();
		emps.put(e1, 101); // 員工 , 員編
		emps.put(e2, 102);
		emps.put(e3, 103);

		System.out.println(emps);

	}

}
