package com.study.ocp.day18;

import java.util.concurrent.Executor;

public class MyLottoExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		Thread t = new Thread(command);
		t.start();
	}

}
