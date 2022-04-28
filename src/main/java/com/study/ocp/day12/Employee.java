package com.study.ocp.day12;

public class Employee implements Comparable<Employee> {

	private String name;
	private String neighborhood;
	private int salary;

	public Employee() {
	}

	public Employee(String name, String neighborhood, int salary) {
		this.name = name;
		this.neighborhood = neighborhood;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name = " + name + ", neighborhood = " + neighborhood + ", salary = " + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return (name.hashCode() * 7 + neighborhood.hashCode() + salary) - (o.name.hashCode() * 7 + o.neighborhood.hashCode() + o.salary);
	}

}
