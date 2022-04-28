package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		
		//String sql = "Select * From Employee"; // 不建議使用 *
		//String sql = "Select id, name, age, salary From Employee";
		String sql = "Select id, name, age, salary From Employee order by salary desc"; // 根據 salary 由大->小 desc , 由小->大 asc(預設)
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo.db";
		
		try (Connection conn = DriverManager.getConnection(dbUrl);
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)){ // SQL 查詢使用 executeQuery()
			
			ResultSetMetaData sm = rs.getMetaData();
			System.out.println(sm.getTableName(1));
			System.out.println("+-----+----------+----+----------+");
			System.out.printf("|%5s|%-10s|%4s|%10s|\n", sm.getColumnName(1), sm.getColumnName(2), sm.getColumnName(3), sm.getColumnName(4));
			System.out.println("+-----+----------+----+----------+");
			
			// 利用 while 將 rs 集合內的資料依序顯示
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				System.out.printf("|%5d|%-10s|%4d|%10.1f|\n", id, name, age, salary);
				System.out.println("+-----+----------+----+----------+");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
