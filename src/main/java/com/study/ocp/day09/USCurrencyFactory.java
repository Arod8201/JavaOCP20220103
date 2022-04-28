package com.study.ocp.day09;

public class USCurrencyFactory {

	public static void main(String[] args) {

		// 製造 5美分 的硬幣
		USCurrency usCoin = USCurrency.NICKLE;
		System.out.println(usCoin.getValue());

	}

}
