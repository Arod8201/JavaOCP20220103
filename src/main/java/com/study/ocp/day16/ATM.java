package com.study.ocp.day16;

public class ATM {

	public static void main(String[] args) {

		Account account = new Account(10_000);
		System.out.printf("帳戶餘額 $%,d\n", account.getBalance());

		System.out.println("提款 ...");

		Thread t1 = new Thread(new Withdraw(account, 5_000), "小明"); // 小明去提款
		Thread t2 = new Thread(new Withdraw(account, 4_000), "小華"); // 小華去提款
		Thread t3 = new Thread(new Withdraw(account, 3_000), "小英"); // 小英去提款

		// 開始提款作業
		t1.start();
		t2.start();
		t3.start();

		StringBuilder s1; // Non-Thread-Safe (單工用 , 只用在某一方法中 , 不可建立物件變數) 1.5
		StringBuffer  s2; //     Thread-Safe (多執行緒用 , 建立物件變數)					1.0
	}

}
