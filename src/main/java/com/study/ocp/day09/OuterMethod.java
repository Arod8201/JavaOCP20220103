package com.study.ocp.day09;

public class OuterMethod {

	public void bar(int y) {
		// 區域變數
		int x = 10;
		class Inner {
			void callMe() {
				System.out.println("Call Me !!");
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner in = new Inner();
		in.callMe();
	}

}
