package com.study.ocp.day24.console;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入 ServerSocket IP: ");
		String ip = sc.next();
		System.out.print("請輸入 ServerSocket Port: ");
		int port = sc.nextInt();

		// 1. 建立 Socket 連線
		Socket socket = new Socket(ip, port);
		System.out.println("與 Server 端建立連線成功 !");

		// 2. 建立 Input/Output Stream
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

		while (true) {
			sc = new Scanner(System.in);
			// 3. 將資料傳給 Server
			System.out.print("請輸入傳送訊息: ");
			String message = sc.next();
			oos.writeObject(message);
			if (message.equalsIgnoreCase("exit")) {
				break;
			}
			// 4. 讀取 Server 傳來的資料
			System.out.printf("Server 說: %s\n", (String) ois.readObject());
		}

		// 5. 關閉 Socket 連線
		socket.close();

	}

}
