package com.study.ocp.design_pattern.observer;

public class User implements Observer {

	private String name;

	public User(String name) {
		this.name = name;
	}

	// 收到更新
	@Override
	public void update(String data) {
		System.out.printf("%s 收到: %s\n", name, data);
	}

	@Override
	public String toString() {
		return "User [name= " + name + "]";
	}

}
