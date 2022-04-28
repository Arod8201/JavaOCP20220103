package com.study.ocp.day06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PersonTest3 {

	public static void main(String[] args) {

		Person p1 = new Person();
		Student s1 = new Student("Arod", 18, 100);
		Student s2 = new Student("Helen", 19, 75);
		Student s3 = new Student("Bobo", 18, 80);
		Teacher t1 = new Teacher("Anita", 30, 70_000);
		Teacher t2 = new Teacher("Jane", 28, 65_000);

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(s1);
		persons.add(s2);
		persons.add(s3);
		persons.add(t1);
		persons.add(t2);
		// System.out.println(persons);

		// 排除異常資料的 filter
		Predicate<Person> notNullFilter = p -> (p.getName() != null && p.getAge() != null);

		// 請問 persons 的平均年齡 = ?
		double avgOfAge = persons.stream().filter(notNullFilter)
				// .map(Person :: getAge)
				.mapToInt(Person::getAge)
				// .peek(System.out :: println);
				.average().getAsDouble();
		// .forEach(System.out :: println);
		System.out.printf("平均年齡 = %.1f\n", avgOfAge);
		System.out.println("========================");

		// 請問平均分數 = ?
		double avgOfScore = persons.stream()
				// .filter(notNullFilter) // 也可以.filter(p -> p.getName() != null)
				.filter(p -> p instanceof Student) // 也可以.filter(p -> p.getClass().getSimpleName().equals("Student"))
				.map(p -> (Student) p) // 也可以.mapToInt(p -> ((Student)p).getScore())
				.mapToInt(Student::getScore).average().getAsDouble();
		// .forEach(System.out::println);
		System.out.printf("平均分數 = %.1f\n", avgOfScore);
		System.out.println("========================");

		// 請問平均薪資 = ?
		double avgOfSalary = persons.stream()
				// .filter(notNullFilter)
				.filter(p -> p instanceof Teacher) // 也可以.filter(p -> p.getClass().getSimpleName().equals("Teacher"))
				.map(p -> (Teacher) p).mapToInt(Teacher::getSalary).average().getAsDouble();
		// .forEach(System.out::println);
		System.out.printf("平均薪資 = $%,.1f\n", avgOfSalary);
		System.out.println("========================");

		// 請問姓名總字數 = ?
		int sumOfName = persons.stream().filter(notNullFilter) // 也可以.filter(p -> p.getName() != null)
				.map(Person::getName).mapToInt(String::length).sum();
		// .forEach(System.out::println);
		System.out.printf("姓名總字數 = %d\n", sumOfName);
		System.out.println("========================");

	}

}
