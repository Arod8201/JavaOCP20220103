package com.study.ocp.day02;

/*
調查五位學生之身高及體重如下，試比較其分散程度。
身高：172、168、164、170、176(公分)
體重：62、57、58、64、64(公斤)
*/

public class Homework {

	public static void main(String[] args) {

		double[] height = { 172, 168, 164, 170, 176 };
		double[] weight = { 62, 57, 58, 64, 64 };

		double height_cv = MathUtils.getCV(height);
		double weight_cv = MathUtils.getCV(weight);

		System.out.printf("身高變異係數: %.2f\n", height_cv);
		System.out.printf("體重變異係數: %.2f\n", weight_cv);

	}

}
