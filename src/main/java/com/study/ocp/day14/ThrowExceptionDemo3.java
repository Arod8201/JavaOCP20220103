package com.study.ocp.day14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

// 自訂例外類別
public class ThrowExceptionDemo3 {

	private static List<String> users = Arrays.asList("a01", "b02", "c03");

	public static void main(String[] args) {
		
		try {
				loginForm();
		} catch (LoginException ex) {
				System.out.println(ex.getMessage());
				ex.列印錯誤訊息();
				ex.要怎麼辦();
		}

	}

	// 登入作業輸入畫面
	public static void loginForm() throws LoginException{
		System.out.print("請輸入 username: ");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		boolean check = checkLogin(username);
		System.out.println("登入成功: " + check);
		sc.close();
	}

	// 驗證是否登入成功 ?
	// 若驗證成功回傳 true , 反之拋出 Exception 例外
	public static boolean checkLogin(String username) throws LoginException {
		Optional<String> opt = users .stream()
									 .filter(username::equals)
									 .findAny();
		if (opt.isPresent()) {
			return true;
		}else {
			LoginException e = new LoginException("找不到此人: " + username);
			throw e;
		}
	}

}
