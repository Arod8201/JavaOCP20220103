package com.study.ocp.java8_1z0_808.lesson_1.test27;

public class Test {

	public static void main(String[] args) {

		int x = 1;
		int y = 0;

		if (x++ > ++y) {
			System.out.print("Hello ");
		} else {
			System.out.print("Welcome ");
		}
		System.out.print("Log " + x + ":" + y);
		
		/*
		  先做的順序: 
		   			 1. if(x > ++y)
		   			 2. if(x > ++y) 所以 y=1
		   			 3. if(x >   1) 回傳 false
		   			 4. if(x++ >  ) 所以 x=2
		*/
	}

}
