package com.study.ocp.day15;

public class StockPrice implements Runnable {

	@Override
	public void run() {
		System.out.println("開始抓取台積電股價 ... 請稍待 ...");
		try {
			Thread.sleep(3000); // 暫停 3秒鐘 (模擬執行時間)
		} catch (Exception e) {

		}
		System.out.println("台積電股價 650元");
	}

}
