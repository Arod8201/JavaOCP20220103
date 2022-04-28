package com.study.ocp.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
-- 每檔股票賺賠
		select p.symbol, s.name, p.shares, p.cost, s.price, ((s.price-p.cost)* p.shares) as subtotal
		from portfolio p, stock s
		where p.symbol = s.symbol
	
-- 總和
		select sum((s.price-p.cost)* p.shares) as total
		from portfolio p, stock s
		where p.symbol = s.symbol
*/
public class SelectStock {

	public static void main(String[] args) throws Exception {

		// 利用 jdbc 將每檔股票賺賠與總和 顯示出
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day26/demo.db";
		String sql = "select p.symbol, s.name, p.shares, p.cost, s.price, ((s.price-p.cost)* p.shares) as subtotal\r\n"
				+ "from portfolio p, stock s\r\n"
				+ "where p.symbol = s.symbol";

		Connection conn = DriverManager.getConnection(dbUrl);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.printf("%s\t%s\t%,d\t%,.2f\t%,.2f\t%,.2f\n", rs.getString(1), rs.getString(2), rs.getInt(3),
					rs.getDouble(4), rs.getDouble(5), rs.getDouble(6));
		}

		sql = "select sum((s.price-p.cost)* p.shares) as total\r\n" + "from portfolio p, stock s\r\n"
				+ "where p.symbol = s.symbol";

		rs = stmt.executeQuery(sql);
		System.out.println();
		while (rs.next()) {
			System.out.printf("$%,.2f\n", rs.getDouble(1));
		}

	}

}
