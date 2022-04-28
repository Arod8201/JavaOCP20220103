package com.study.ocp.day21;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {

	public static void main(String[] args) {

		String basePath = "src/main/java/com/study/ocp/day21";
		String folderName = "files";
		String fileName = "data.txt";

		File path = new File(basePath + File.separator + folderName);
		if (!path.exists()) { // 若此資料不存在
			// 建立資料夾
			path.mkdir();
			System.out.println("資料夾建立成功");
		} else {
			System.out.println(folderName + " 資料夾已存在");
		}

		System.out.println("==============================");

		File file = new File(path.getPath() + File.separator + fileName);
		if (!file.exists()) { // 檔案不存在
			// 建立檔案
			try {
				file.createNewFile();
				System.out.println("建立檔案成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(fileName + " 檔案已存在");
		}

	}

}
