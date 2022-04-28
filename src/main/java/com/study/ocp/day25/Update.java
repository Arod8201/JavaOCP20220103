package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class Update {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo.db";
		String sql = "UPDATE Employee SET salary = ? WHERE id = ?";
		
		try (Connection conn = DriverManager.getConnection(dbUrl);
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setDouble(1, new Random().nextInt(100000));
			pstmt.setInt(2, 1);
			
			int rowcount = pstmt.executeUpdate();
			System.out.println("Update rowcount = " + rowcount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
