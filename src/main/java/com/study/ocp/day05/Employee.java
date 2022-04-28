package com.study.ocp.day05;

public class Employee {

	// 物件屬性/物件變數/物件欄位/物件資產
	private String name;
	private Integer age;
	private Integer salary;

	// 封裝(空的建構子)
	public Employee() {
	}

	// 封裝(建構子)
	// 目的: 設定/取得 物件屬性的資料
	public Employee(String name, Integer age, Integer salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// 封裝(方法)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	// 印出物件資料用
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
