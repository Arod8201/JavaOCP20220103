package com.study.ocp.java8_1z0_808.lesson_1.test24;

public class Test {

	public static void main(String[] args) {

		String ta = "A "; 	  // ta = A ;
		ta = ta.concat("B "); // ta = A B ;
		String tb = "C ";	  // tb = C ;
		ta = ta.concat(tb);	  // ta = A B C ;
		ta.replace('C', 'D'); // A B D ;
		ta = ta.concat(tb);	  // ta = A B C C ;

		System.out.println(ta);

	}

}
