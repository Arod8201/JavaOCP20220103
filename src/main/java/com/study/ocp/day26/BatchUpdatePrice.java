package com.study.ocp.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class BatchUpdatePrice {

	public static void main(String[] args) {
		
		// 將最新報價資料更新到 stock 資料表
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day26/demo.db";
		String sql = "select symbol from stock";
		final String sql2 = "update stock set price = ? where symbol = ?";
		
		try (Connection conn = DriverManager.getConnection(dbUrl);
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql);
			 PreparedStatement pstmt = conn.prepareStatement(sql2)){
			
			List<String> symbols = new ArrayList<>();
			while (rs.next()) {
				symbols.add(rs.getString("symbol"));
			}
			
			System.out.println(symbols);
			
//=========================================================================================================
			
			// 利用 java yahoo finance api 查詢股價資料
			// https://financequotes-api.com/
			// ArrayList 轉 String[]
			//System.out.println(Arrays.toString(symbols.toArray(new String[0])));
			Map<String, Stock> stocks = YahooFinance.get(symbols.toArray(new String[0])); // single request
			// 檢視 stocks 裡的資料 1
			System.out.println(stocks);
			// 檢視 stocks 裡的資料
			stocks.forEach((k, v) -> System.out.println(k + ", " + v.getQuote().getPrice()));
			
			pstmt.clearBatch(); // 清除 batch
			
			for(Stock stock : stocks.values()) {
				pstmt.setDouble(1, stock.getQuote().getPrice().doubleValue());
				pstmt.setString(2, stock.getSymbol());
				pstmt.addBatch();
			}
			
			int[] rowcounts = pstmt.executeBatch();
			System.out.println("Stock batch update price , rowcounts = " + Arrays.toString(rowcounts));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
