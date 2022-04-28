package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		String sql = "CREATE TABLE IF NOT EXISTS Employee (" +
					 		 " id INTEGER NOT NULL UNIQUE," +
					 		 " \"name\" TEXT NOT NULL," +
					 		 " age INTEGER DEFAULT 18," +
					 		 " salary REAL NOT NULL DEFAULT 25250," +
					 		 " PRIMARY KEY(id) " +
					 		 ");";
		System.out.println(sql);
		
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo.db";
		try (Connection conn = DriverManager.getConnection(dbUrl);
			 Statement stmt = conn.createStatement()){
			// 執行 SQL 語句
			// true: 表示 SQL 是 Select 查詢語句 , 反之是 false
			System.out.println(stmt.execute(sql));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
