package com.study.ocp.day25;

class Dog {
	String name = "狗";
}

class Cat {
	String name = "貓";
}

public class ClassForNameDemo {

	public static void main(String[] args) throws Exception {

		System.out.println(Class.forName("com.study.ocp.day25.Dog").newInstance());
		Dog d = (Dog) Class.forName("com.study.ocp.day25.Dog").newInstance();
		System.out.println(d.name);

	}

}
