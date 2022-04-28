package com.study.ocp.day03;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {

		String words = "she sell sea shell on the sea shore";
		System.out.println(words);
		System.out.println("--------------------------");

		// words 的長度
		System.out.printf("長度: %d\n", words.length());
		System.out.println("--------------------------");

		// 有沒有 on 這個字
		System.out.printf("on 的位置在: %d\n", words.indexOf("on"));
		System.out.println("--------------------------");

		// 有沒有 off 這個字
		System.out.printf("off 的位置在: %d\n", words.indexOf("off")); // 沒有這個字會回傳 -1
		System.out.println("--------------------------");

		// 有幾個字 ? 提示: split()
		String[] wordarray = words.split(" ");
		System.out.println(Arrays.toString(wordarray));
		System.out.println("有幾個字: " + wordarray.length);

	}

}
