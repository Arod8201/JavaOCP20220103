package com.study.ocp.day18;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledExecDemo {

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		System.out.printf("Time:%s\n", new Date());
		service.scheduleWithFixedDelay(new Lotto(), 0, 1, TimeUnit.SECONDS);

		//service.shutdown();

	}

}
