package com.study.ocp.day17;

public class CookiesMain {

	public static void main(String[] args) {

		Cookies cookies = new Cookies();

		Thread master = new Thread(new Master(cookies), "主人");
		Thread dog = new Thread(new Dog(cookies), "小狗");

		master.start();
		dog.start();

	}

}
