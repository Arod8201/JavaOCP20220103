package com.study.ocp.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class BatchInsert3 {

	public static void main(String[] args) {
		
		String[][] datas = {
				{"2330.TW", "5000", "550"},
				{"1101.TW", "7000", "55"},
				{"2409.TW", "8000", "25"},
				{"3008.TW", "2000", "1400"},
				{"2753.TW", "9000", "125.5"},
				{"2882.TW", "4000", "68.8"},
		};
		
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day26/demo.db";
		String sql = "insert into portfolio(symbol, shares, cost) values(?, ?, ?)";
		
		try (Connection conn = DriverManager.getConnection(dbUrl);
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.clearBatch(); // 清除 batch
			
			for(String[] data : datas) {
				pstmt.setString(1, data[0]);
				pstmt.setInt(2, Integer.parseInt(data[1]));
				pstmt.setDouble(3, Double.parseDouble(data[2]));
				pstmt.addBatch();
			}
			
			int[] rowscounts = pstmt.executeBatch();
			System.out.println("Portfolio batch insert , rowscounts = " + Arrays.toString(rowscounts));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
