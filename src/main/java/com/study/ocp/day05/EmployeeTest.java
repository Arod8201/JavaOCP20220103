package com.study.ocp.day05;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		// 建立員工物件
		Employee e1 = new Employee();
		e1.setName("John");
		e1.setAge(25);
		e1.setSalary(50_000);

		Employee e2 = new Employee("Mary", 27, 60_000);
		Employee e3 = new Employee("Mark", 31, 90_000);

		// 印出每一個物件資料
		System.out.println(e1.toString());
		System.out.println(e2); // 相當於呼叫 e2.toString()
		System.out.println(e3);

		// 建立員工陣列
		// 使用 Employee [] 就不可以再次增加員工
		Employee[] employees1 = { e1, e2, e3 };
		System.out.println(employees1);

		// 若使用 List.of 就不可以再次增加員工
		List<Employee> employees2 = List.of(employees1); // 等同於 List.of(e1, e2, e3)
		System.out.println(employees2);

		// 若使用 new ArrayList<>() 可以任意增加/刪減員工
		ArrayList<Employee> employees3 = new ArrayList<>();
		employees3.add(e1);
		employees3.add(e2);
		employees3.add(e3);
		System.out.println(employees3);

	}

}
