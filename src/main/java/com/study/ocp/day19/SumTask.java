package com.study.ocp.day19;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {

	// 門檻值
	final static int THRESHOLD = 3; // RecursiveTask 參數一定要是 (final static int)

	// 任務數組
	long[] array;

	// 起始位置
	int start, end;

	// 建構子任務注入
	public SumTask(long[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {
		// 1. 判斷任務是否小於門檻值(弱勢就直接計算 , 反之則繼續拆分任務)
		if (end - start <= THRESHOLD) {
			long sum = 0;
			for (int i = start; i < end; i++) {
				sum += this.array[i];
			}
			return sum;
		}

		// 2. 將任務一分為二
		int middle = (end + start) / 2;
		System.out.printf("split %d~%d ==> %d~%d, %d~%d\n", start, end, start, middle, middle, end);

		// 3. 分裂任務
		SumTask sumTask1 = new SumTask(this.array, start, middle);
		SumTask sumTask2 = new SumTask(this.array, middle, end);

		// 4. 透過 invokeAll() 並行運行任務
		invokeAll(sumTask1, sumTask2);

		// 5. 獲得子任務結果
		long subResult1 = sumTask1.join();
		long subResult2 = sumTask2.join();

		// 6. 匯總結果
		long result = subResult1 + subResult2;
		System.out.printf("result = %d + %d ==> %d\n", subResult1, subResult2, result);

		return result;
	}

}
