package com.study.ocp.day18;

import java.util.concurrent.Executor;

public class MyLottoMain {

	public static void main(String[] args) {

		Executor exec = new MyLottoExecutor();

		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());

	}

}
