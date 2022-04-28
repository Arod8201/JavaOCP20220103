package com.study.ocp.day04;

import java.util.Arrays;

public class MultiArrayDemo3 {

	public static void main(String[] args) {

		int[][][] scores = { 
				{ {100, 90, 80 }, { 70, 60 },{50}},
				{{40,30},{20}},
				{{10,5}}				
		};
		//System.out.println(scores[0][2][0]);
		
		// 1. 求總分 = ?
		int sum = 0;
		for(int i=0; i < scores.length; i++) {
			for(int j=0; j < scores[i].length; j++) {
				for(int k=0; k < scores[i][j].length; k++) {
					sum += scores[i][j][k];
				}
			}
		}
		System.out.println("sum: " + sum);
			
		// 2. 求總分 = ?
		int sum2 = 0;
		for(int x[][] : scores) {
			for(int y[] : x) {
				for(int k : y) {
					sum2 += k;
				}
			}
		}
		System.out.println("sum2: " + sum2);
		
		// 3. 求總分 = ?
		int sum3 = Arrays.stream(scores)
						 .flatMapToInt(e -> Arrays.stream(e).flatMapToInt(e2 -> Arrays.stream(e2)))
						 .sum();
		System.out.println("sum3: " + sum3);
		
		// 4. 求總分 = ?
		int sum4 = Arrays.stream(scores)
						 .flatMap(e -> Arrays.stream(e))
						 .flatMapToInt(e -> Arrays.stream(e))
						 .sum();
		System.out.println("sum4: " + sum4);
		
	}

}
