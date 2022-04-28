package com.study.ocp.day08_4;

public class SingleTonTest {
	
	public static void main(String[] args) {
		
		//SingleTon s1 = new SingleTon();
		//SingleTon s2 = new SingleTon();
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println(s1.getNum());
		System.out.println(s2.getNum());
		
	}

}
/*
考題:
You want to create a singleton class by using the Singleton design pattern.

Which two statements enforce the singleton nature of the design?

A. Make the class static.
B. Make the constructor private.
C. Override equals() and hashCode() methods of the java.lang.Object class.
D. Use a static reference to point to the single instance.
E. Implement the Serializable interface.

Ans: BD 
*/