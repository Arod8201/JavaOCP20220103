package com.study.ocp.day14;

// 自定義例外錯誤類別需要繼承一個基礎例外(一般都是指: Exception , 最好是受檢例外)
public class LoginException extends Exception {

	private String errorMessage;

	public LoginException(String errorMessage) {
		super(errorMessage); // 讓使用者可以透過 getMessage() 取資料
		this.errorMessage = errorMessage;
	}

	public void 要怎麼辦() {
		System.out.println("請重新登入");
	}

	public void 列印錯誤訊息() {
		System.out.println("錯誤訊息: " + errorMessage);
	}

}
