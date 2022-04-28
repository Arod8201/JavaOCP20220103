package com.study.ocp.design_pattern.observer;

public class News extends Subject { // 新聞主題

	@Override
	public void add(Observer observer) {
		list.add(observer);
		System.out.println("有人加入 News: " + observer);
	}

	@Override
	public void remove(Observer observer) {
		list.remove(observer);
		System.out.println("有人移出 News: " + observer);
	}

	@Override
	public void notifyObserver(String data) {
		// 通知每一個訂閱者
		list.stream().forEach(observer -> observer.update("News -> " + data));
	}

}
