package com.study.ocp.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject { // 主題

	protected List<Observer> list = new ArrayList<>(); // 訂閱粉絲

	public abstract void add(Observer observer); // 訂閱

	public abstract void remove(Observer observer); // 取消訂閱

	public abstract void notifyObserver(String data); // 發送資料給 Observer

}
