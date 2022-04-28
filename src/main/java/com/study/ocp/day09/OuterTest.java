package com.study.ocp.day09;

import com.study.ocp.day09.Outer.SInner;
import com.study.ocp.day09.Outer.SInner.Foo;

public class OuterTest {

	public static void main(String[] args) {

		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.callMe();
		ou.foo();
		System.out.println("========================");
		// -------------------------------------
		Outer.SInner os = new Outer.SInner();
		SInner.printMe(); // os.printMe();
		os.printMe2();
		// os.foo();
		SInner.printMe();
		Foo.bar();

	}

}
