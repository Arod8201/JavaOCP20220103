package com.study.ocp.design_pattern.observer;

public class Test {

	public static void main(String[] args) throws Exception {

		Subject news = new News();
		Subject youtuber = new Youtuber();

		Observer user1 = new User("小明");
		Observer user2 = new User("小華");
		Observer user3 = new User("小英");

		// 訂閱
		news.add(user1);
		news.add(user3);
		youtuber.add(user2);
		youtuber.add(user3);

		// 發送
		System.out.println("News 訊息準備發送 ...");
		Thread.sleep(2000);
		news.notifyObserver("明天放假");

		System.out.println("Youtuber 訊息準備發送 ...");
		Thread.sleep(2000);
		youtuber.notifyObserver("Java 11 程式新功能線上說明會 ...");

		// 有人加入 / 取消訂閱
		youtuber.remove(user3);
		youtuber.add(user1);
		System.out.println("Youtuber 訊息準備發送2 ...");
		Thread.sleep(2000);
		youtuber.notifyObserver("Spring Cloud 新功能線上說明會 ...");

	}

}
