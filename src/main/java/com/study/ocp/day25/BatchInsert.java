package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

import com.github.javafaker.Faker;

// 批次新增
public class BatchInsert {

	public static void main(String[] args) {

		String sql = "INSERT INTO Employee(name, age, salary) VALUES(?, ?, ?)";
		String dbsql = "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo.db";
		Random random = new Random();
		Faker faker = new Faker();

		try (Connection conn = DriverManager.getConnection(dbsql);
			 PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.clearBatch(); // 清除 batch

			for (int i = 0; i < 1000; i++) {
				pstmt.setString(1, faker.name().firstName());
				pstmt.setInt(2, 20 + random.nextInt(20));
				pstmt.setDouble(3, 25250 + random.nextInt(100000));
				pstmt.addBatch(); // 加入 batch
			}

			int[] rowcounts = pstmt.executeBatch(); // 批次執行
			System.out.println("批次執行 OK!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
