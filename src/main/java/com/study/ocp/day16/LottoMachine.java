package com.study.ocp.day16;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LottoMachine {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("取得 lotto 數字");

		FutureTask<Integer> task = new FutureTask<Integer>(new Lotto());

		// 建立一個執行緒去執行
		new Thread(task).start();

		// 取得 lotto 數字
		int number = task.get();

		// 印出
		System.out.println(number);

	}

}
