package com.study.ocp.day24.console;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {

	public static void main(String[] args) throws Exception {

		// 1. 建立 ServerSocket
		int port = 5001;
		ServerSocket server = new ServerSocket(port);
		String serverIP = InetAddress.getLocalHost().getHostAddress();

		// 2. 等待 Client 端進來並建立 Socket 連線
		System.out.println("等待 Client 端進來並建立 Socket 連線");
		Socket socket = server.accept();
		System.out.printf("已連入 , Client 端 %s:%d\n", socket.getInetAddress(), socket.getPort());

		// 3. 建立 Input/Output Stream
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String message = (String) ois.readObject();
			if (message.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.printf("Client 說: %s\n", message);

			// 5. 回應(將資料傳給 Client 端)
			System.out.print("請輸入回應訊息: ");
			oos.writeObject(sc.next());
		}
		System.out.println("Socket 連線關閉");
		socket.close();

	}

}
