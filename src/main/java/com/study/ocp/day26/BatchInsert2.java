package com.study.ocp.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class BatchInsert2 {

	public static void main(String[] args) {
		
		String[][] datas = {
				{"1101.TW", "台泥", "1"},
				{"1102.TW", "亞泥", "1"},
				{"1108.TW", "幸福", "1"},
				
				{"1201.TW", "味全", "2"},
				{"1216.TW", "統一", "2"},
				{"1217.TW", "愛之味", "2"},
				{"1234.TW", "黑松", "2"},
				
				{"2303.TW", "聯電", "3"},
				{"2330.TW", "台積電", "3"},
				{"2454.TW", "聯發科", "3"},
				
				{"2409.TW", "友達", "4"},
				{"3008.TW", "大立光", "4"},
				
				{"2705.TW", "六福", "5"},
				{"2707.TW", "晶華", "5"},
				{"2727.TW", "王品", "5"},
				{"2753.TW", "八方雲集", "5"},
				{"9943.TW", "好樂迪", "5"},
				
				{"2882.TW", "國泰金", "6"},
				{"2884.TW", "玉山金", "6"},
				{"2885.TW", "元大金", "6"},
				{"5880.TW", "合庫金", "6"},
		};
		
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day26/demo.db";
		String sql = "insert into stock(symbol, name, classify_id) values(?, ?, ?)";
		
		try (Connection conn = DriverManager.getConnection(dbUrl);
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.clearBatch(); // 清除 batch
			
			for(String[] data : datas) {
				pstmt.setString(1, data[0].trim());
				pstmt.setString(2, data[1].trim());
				pstmt.setInt(3, Integer.parseInt(data[2]));
				pstmt.addBatch();
			}
			
			int[] rowscounts = pstmt.executeBatch();
			System.out.println("Stock batch insert , rowscounts = " + Arrays.toString(rowscounts));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
