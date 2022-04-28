package com.study.ocp.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest2 {

	public static void main(String[] args) {

		// 建立員工物件
		Employee e1 = new Employee("John", 25, 50_000);
		Employee e2 = new Employee("Mary", 27, 60_000);
		Employee e3 = new Employee("Mark", 31, 90_000);

		// 1. 請求出總薪資 = ?
		int sum1 = e1.getSalary() + e2.getSalary() + e3.getSalary();
		System.out.printf("總薪資: $%,d\n", sum1);

		// 2. 請求出總薪資 = ?
		Employee[] employees = { e1, e2, e3 };
		int sum2 = 0;
		for (Employee emp : employees) {
			sum2 += emp.getSalary();
		}
		System.out.printf("總薪資: $%,d\n", sum2);

		// 3. 請求出總薪資 = ? 使用 Java 8 stream 來計算
		int sum3 = Arrays.stream(employees).mapToInt(e -> e.getSalary()).sum();
		System.out.printf("總薪資: $%,d\n", sum3);

		int sum4 = Arrays.stream(employees).mapToInt(Employee::getSalary).sum();
		System.out.printf("總薪資: $%,d\n", sum4);

		// 4. Homework employees 可以依照薪資大小排序
		ArrayList<Integer> employees2 = new ArrayList<>();
		employees2.add(e1.getSalary());
		employees2.add(e2.getSalary());
		employees2.add(e3.getSalary());
		
		List<Integer> order_employees2 = employees2.stream()
												   .sorted(Comparator.reverseOrder())
												   .collect(Collectors.toList());
		System.out.println("薪資大小排序為: " + order_employees2);

	}

}
