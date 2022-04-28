package com.study.ocp.day16;

public class Withdraw implements Runnable {

	private Account account;
	private int money;

	public Withdraw(Account account, int money) {
		// 得到指定帳戶與欲提款金額
		this.account = account;
		this.money = money;
	}

	@Override
	public void run() {
		// 盡情提款
		account.withdraw(money);
	}

}
