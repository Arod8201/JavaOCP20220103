package com.study.ocp.day14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ThrowExceptionDemo {

	private static List<String> users = Arrays.asList("a01", "b02", "c03");

	public static void main(String[] args) {
		
		try {
				loginForm();
		} catch (Exception e) {
			System.out.println("錯誤訊息: " + e);
			System.out.println("請重新登入");
			main(null); // 重新執行 main
		}

	}

	// 登入作業輸入介面
	public static void loginForm() throws Exception{
		System.out.print("請輸入 username: ");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		boolean check = checkLogin(username);
		System.out.println("登入成功: " + check);
		sc.close();
	}

	// 驗證是否登入成功 ?
	// 若驗證成功回傳 true , 反之拋出 Exception 例外
	public static boolean checkLogin(String username) throws Exception {
		Optional<String> opt = users.stream()
									.filter(username::equals)
									.findAny();
		if (opt.isPresent()) {
			return true;
		} else {
			Exception e = new Exception("找不到此人: " + username);
			throw e;
		}
	}

	public static boolean checkLogin2(String username) {
		Optional<String> opt = users.stream()
								    .filter(username::equals)
								    .findAny();
		if (opt.isPresent()) {
			return true;
		}else {
			return false;
		}
	}

}
