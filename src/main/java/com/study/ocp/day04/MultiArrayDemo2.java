package com.study.ocp.day04;

import java.util.Arrays;

public class MultiArrayDemo2 {

	public static void main(String[] args) {

		int[][] scores = { { 100, 90, 80 }, { 70, 60 } };
		
		// 1. 求總分 = ?
		int sum1=scores[0][0] + scores[0][1] + scores[0][2]+
				 scores[1][0]  +scores[1][1];
		System.out.println("sum1: " + sum1);
			
		// 2. 求總分 = ?
		int sum2 = 0;
		for(int i=0; i < scores.length; i++) {
			for(int j=0; j < scores[i].length; j++ ) {
				sum2 += scores[i][j];
			}
		}
		System.out.println("sum2: " + sum2);
		
		// 3. 求總分 = ?
		int sum3 = 0;
		for(int[] x : scores) {
			for(int y : x) {
				sum3 += y;
			}
		}
		System.out.println("sum3: " + sum3);
		
		// 4. 求總分 = ?
		int sum4 = Arrays.stream(scores)
						 .map(s -> Arrays.stream(s))
						 .mapToInt(s -> s.sum())
						 .sum();
		System.out.println("sum4: " + sum4);
		
		// 5. 求總分 = ?
		int sum5 = Arrays.stream(scores)
						 .flatMapToInt(s -> Arrays.stream(s))
						 .sum();
		System.out.println("sum5: " + sum5);
		
	}

}
