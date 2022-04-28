package com.study.ocp.day09;

public class Outer {

	static int sx = 9;
	int x = 7;

	// 一般內部類別
	class Inner {
		int x = 77;

		void callMe() {
			int x = 777;
			System.out.println("Call Me !!");
			System.out.println(x); // 777
			System.out.println(this.x); // 77
			System.out.println(Outer.this.x); // 7
			System.out.println(Outer.sx); // 9
		}
	}

	// 靜態內部類別
	static class SInner {
		static void printMe() {
			System.out.println("Print Me !!");
		}

		void printMe2() {
			System.out.println("Print Me2 !!");
		}

		static class Foo {
			static void bar() {
				System.out.println("bar ~");
			}
		}
	}

	public void foo() {
		Inner in = new Inner();
		in.callMe();
	}

}
