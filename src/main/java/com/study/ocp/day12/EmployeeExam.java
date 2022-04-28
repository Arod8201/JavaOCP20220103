package com.study.ocp.day12;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EmployeeExam {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("1", "B", 200));
		emps.add(new Employee("2", "B", 500));
		emps.add(new Employee("3", "A", 300));
		emps.add(new Employee("4", "A", 200));
		emps.add(new Employee("5", "C", 100));
		emps.add(new Employee("6", "C", 200));

		Map<String, Optional<Employee>> map;
		// map contain the employee with the highest salary for each neighborhood ?
		// 要顯示每一組 (根據 neighborhood 分組)的 salary 的最大值
		// 結果: Employee("2", "B", 500), Employee("3", "A", 300), Employee("6", "C", 200)
		map = emps.stream()
				  .collect(groupingBy(Employee::getNeighborhood, maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println("每一組 salary 的最大值: " + map);
		System.out.println("=================================================================");

		System.out.println(map.get("A").get());

	}

}
