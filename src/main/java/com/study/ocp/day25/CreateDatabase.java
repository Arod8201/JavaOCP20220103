package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDatabase {

	public static void main(String[] args) {

		// 若是使用 JDBC 3.0 或在 Web 上使用 需要利用 Class.forName() 來動態建立 Driver 實體
		// JDBC 4.0 則不用
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		// 資料庫連線位置
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo.db";
		// String username = ""; // 連結使用 sqlite 不用 username 與 password
		// String password = "";
		try (Connection conn = DriverManager.getConnection(dbUrl)) {
			System.out.println("資料庫建立成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
