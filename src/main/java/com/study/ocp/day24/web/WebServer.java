package com.study.ocp.day24.web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class WebServer {

	public static void main(String[] args) {

		WebServer webServer = new WebServer();
		// webServer
	}

	public void start() throws Exception {
		ServerSocket server;
		System.out.println("WebServer 啟動");
		server = new ServerSocket(80);

		while (true) {
			System.out.println("等待瀏覽器的連線");
			Socket socket = server.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			System.out.println("瀏覽器成功進入");
			/*
			 String data = null; 
			 System.out.println("瀏覽器傳來的資料: ");
			 while ((data =br.readLine()) != null) { 
			 		 System.out.println(data); // 得到 HTTP 文件 
			 }
			*/

			// -------------------------------------------------------------------------------------------------------
			// 回應 HTTP 文件結構 (4 parts)

			// Part 1: init line
			out.println("HTTP/1.1 200 OK");

			// Part 2: header info
			out.println("Content-Type: text/html");
			out.println("Server GjunWebServer" + new Date().getTime());

			// Part 3: Blank line
			out.println();

			// Part 4: Body (回應給瀏覽器的 HTML 內容)
			//out.println("<H1>現在時刻: " + new Date() + "</H1>");
			Path path = Paths.get("src/main/java/com/study/ocp/day24/web/welcome.happy");
			out.println(String.format(Files.readAllLines(path).toString(), new Date()));
			out.close();

		}
	}

}
