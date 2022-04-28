package com.study.ocp.day15;

public class StockNews implements Runnable {

	@Override
	public void run() {
		System.out.println("開始抓取台積電新聞 ... 請稍待 ...");
		try {
			Thread.sleep(3000); // 暫停 1秒鐘 (模擬執行時間)
			System.out.println("台積電新聞 1");
			Thread.sleep(3000); // 暫停 1秒鐘 (模擬執行時間)
			System.out.println("台積電新聞 2");
			Thread.sleep(3000); // 暫停 1秒鐘 (模擬執行時間)
			System.out.println("台積電新聞 3");
		} catch (Exception e) {

		}
		System.out.println("台積電新聞本日結束");
	}

}
