package com.study.ocp.day09;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new AddCalc();
		System.out.println(calc.computer(10, 20));

		Calc calc2 = new Calc() {
			@Override
			public int computer(int x, int y) {
				return x + y;
			}
		};
		System.out.println(calc2.computer(10, 20));

		// Java 8 Lambda
		Calc calc3 = (int x, int y) -> x + y;
		System.out.println(calc3.computer(10, 20));

		Calc calc4 = (x, y) -> x + y;
		System.out.println(calc4.computer(10, 20));
	}

}
