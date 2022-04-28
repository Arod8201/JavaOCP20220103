package com.study.ocp.day15;

import java.util.Date;

public class ThreadLambda {

	public static void main(String[] args) {

		Runnable now = () -> System.out.println(new Date());

		new Thread(now).start();

	}

}
