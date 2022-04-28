package com.study.ocp.day16;

public class Account {

	private int balance; // 帳戶餘額

	public Account(int balance) { // 建構子封裝 (設定帳戶餘額)
		this.balance = balance;
	}

	public int getBalance() { // 取得帳戶餘額
		return balance;
	}

	// 提款 (money = 提款金額)
	public synchronized void withdraw(int money) {
		// 取得執行緒名稱
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 開始提款, 提款金額 $%,d\n", tName, money);

		// 取得目前最新提款金額 ------------------------------------------------------------
		int currentBalance = getBalance();

		// 模擬運作時間
		for (int i = 0; i < 999999999; i++);

		// 判斷
		if (currentBalance >= money) {
			currentBalance -= money; // 扣掉提款金額
			balance = currentBalance; // 寫回帳戶餘額
			System.out.printf("%s 提款 $%,d 成功, 帳戶餘額 $%,d\n", tName, money, getBalance());
		} else {
			System.out.printf("%s 提款 $%,d 失敗, 帳戶餘額 $%,d\n", tName, money, getBalance());
		}

		// 提款結束 ------------------------------------------------------------
		System.out.printf("%s 提款工作結束\n", tName);
	}

}
