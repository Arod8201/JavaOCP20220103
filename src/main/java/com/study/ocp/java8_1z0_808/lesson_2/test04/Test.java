package com.study.ocp.java8_1z0_808.lesson_2.test04;

public class Test {

	public static void main(String[] args) {

		String[][] chs = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];
		int a = 97;

		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs.length; j++) {
				chs[i][j] = "" + a;
				a++;
			}
		}

		for (String[] i : chs) {
			for (String j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//System.out.println();
	}

}
