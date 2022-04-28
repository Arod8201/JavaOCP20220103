package com.study.ocp.day21;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {

	public static void main(String[] args) throws IOException {

		File filesPath = new File("src/main/java/com/study/ocp/day21/files");
		for (int i = 0; i < 10; i++) {
			// 前綴, 後綴, File 物件
			File tempFile = File.createTempFile("temp", ".txt", filesPath);
			System.out.println(tempFile.getAbsolutePath());
		}

	}

}
