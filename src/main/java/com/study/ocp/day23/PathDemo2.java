package com.study.ocp.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {

	public static void main(String[] args) {

		// .. -> 冗餘路徑
		Path path = Paths.get("C:/temp/aaa/../bb/cc/hello.txt");
		System.out.println(path);

		path = path.normalize(); // 去除冗餘路徑(標準化)
		System.out.println(path);

		System.out.println("=================================");

		// 路徑切換 relativize(相對化)
		Path path1 = Paths.get("src/home/happy");
		Path path2 = Paths.get("src/home/foo/bar");
		// path1 切換到 path2
		System.out.println("path1 切換到 path2: " + path1.relativize(path2));
		// path2 切換到 path1
		System.out.println("path2 切換到 path1: " + path2.relativize(path1));

		System.out.println("=================================");

		// 路徑結合 resolve
		Path aPath = Paths.get("/app/files");
		Path bPath = Paths.get("log/today"); // 相對路徑
		// aPath 結合 bPath
		System.out.println("結合相對路徑.resolve(): " + aPath.resolve(bPath)); // 結合相對路徑

		Path cPath = Paths.get("/web/files");
		Path dPath = Paths.get("/log/today"); // 絕對路徑
		// cPath 結合 dPath
		System.out.println("結合絕對路徑.resolve(): " + cPath.resolve(dPath)); // 結合絕對路徑

	}

}
