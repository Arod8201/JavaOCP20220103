package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {

		//String sql = "INSERT INTO Employee(name, age, salary) VALUES('Vincent', 26, 55000)";
		//String sql = "INSERT INTO Employee(name, age, salary) VALUES('Helen', 28, 75000)";
		String sql = "INSERT INTO Employee(name, age, salary) VALUES('Arod', 27, 45000)";
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo.db";

		try (Connection conn = DriverManager.getConnection(dbUrl); 
			 Statement stmt = conn.createStatement()) {
			
			// 使用 executeUpdate 會傳回資料表因為執行此 sql 所變動的筆數
			int rowcount = stmt.executeUpdate(sql);
			System.out.println("Insert rowcount = " + rowcount);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
