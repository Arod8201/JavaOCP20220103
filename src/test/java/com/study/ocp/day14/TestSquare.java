package com.study.ocp.day14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSquare {

	@Test
	public void test() {
		// 1. Arrange (部署)
		Square square = new Square();
		square.setH(10);
		square.setW(10);
		int expect = 100; // (預計) hot-code(熱代碼)

		// 2. ACT (行為)
		int result = square.getArea(); // (結果)

		// 3. Assert (斷言)
		assertEquals(expect, result);// (預計 , 結果)
		System.out.println("測試成功");
	}

}
