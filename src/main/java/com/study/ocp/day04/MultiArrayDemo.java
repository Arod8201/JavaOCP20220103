package com.study.ocp.day04;

public class MultiArrayDemo {

	public static void main(String[] args) {

		char[][] ttt = { 
				{ 'O', 'X', 'O' }, 
				{ ' ', 'X', 'X' }, 
				{ 'O', ' ', 'O' } 
		};

		System.out.println(ttt);
		System.out.println(ttt[0]);
		System.out.println(ttt[1]);
		System.out.println(ttt[2]);
		System.out.println();
		
		// 如何讓 X 獲勝 ?
		// 1.
//		ttt[1][0] = 'X';
//		System.out.println(ttt[0]);
//		System.out.println(ttt[1]);
//		System.out.println(ttt[2]);
//		System.out.println();
		
		// 2.
		ttt[2][1] = 'X';
		System.out.println(ttt[0]);
		System.out.println(ttt[1]);
		System.out.println(ttt[2]);
		
	}

}
