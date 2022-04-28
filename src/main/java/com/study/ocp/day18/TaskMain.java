package com.study.ocp.day18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskMain {

	public static void main(String[] args) throws Exception {

		// ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newFixedThreadPool(1);

		service.submit(new LongTask());
		service.submit(new Task());
		service.submit(new Task());
		service.submit(new Task());
		service.submit(new LongTask());

		// shutdownNow 立即關閉 , 若仍有執行緒則會拋出 interrupted 例外
		// service.shutdownNow();
		service.shutdown();
		System.out.println("執行 shutdown");

		// 監控 Thread Pool 狀態
		while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
			System.out.println("監控中 ... Thread Pool 尚未關閉");
		}

		System.out.println("Thread Pool 已關閉");
	}

}
