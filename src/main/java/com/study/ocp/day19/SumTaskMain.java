package com.study.ocp.day19;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class SumTaskMain {

	public static void main(String[] args) {

		int len = 10;
		long[] array = new long[len];

		// 期望結果
		long expectedSum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			expectedSum += array[i];
		}
		System.out.printf("任務: %s\n", Arrays.toString(array));
		System.out.printf("期望結果: %d\n", expectedSum);

		System.out.println("============================================");

		// 取得內核數量
		int proc = Runtime.getRuntime().availableProcessors();
		System.out.printf("處理器內核數量: %d\n", proc);

		// ForkJoin task
		ForkJoinTask<Long> task = new SumTask(array, 0, array.length);

		// start time:
		long startTime = System.currentTimeMillis();

		// ForkJoin task 運行
		ForkJoinPool pool = ForkJoinPool.commonPool();
		long result = pool.invoke(task);
		System.out.printf("Pool 所使用的內核數量: %d\n", pool.getPoolSize());

		// end time:
		long endTime = System.currentTimeMillis();
		System.out.printf("Fork/Join 結果: %d in %d ms.\n", result, (endTime - startTime));

	}

}
