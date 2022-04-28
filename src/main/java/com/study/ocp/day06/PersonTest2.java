package com.study.ocp.day06;

import java.lang.reflect.Method;

public class PersonTest2 {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.getClass().getName()); // com.study.ocp.day06.Person
		System.out.println("=============================");

		System.out.println(p1.getClass().getSimpleName()); // Person
		System.out.println("=============================");

		for (Method method : p1.getClass().getMethods()) {
			System.out.println(method.getName());
		}
		System.out.println("=============================");

		Student s1 = new Student("Arod", 18, 100);
		System.out.println(s1);
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getSimpleName());
		System.out.println("=============================");

		Teacher t1 = new Teacher("Anita", 30, 70_000);
		System.out.println(t1);

	}

}
