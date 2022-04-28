package com.study.ocp.day18;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledSingleExecDemo {

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		System.out.printf("Time:%s\n", new Date());
		service.schedule(new Lotto(), 1, TimeUnit.SECONDS); // 停 1 秒後開始 run

		service.shutdown();

	}

}
