package com.study.ocp.day14;

public class TryCatchDemo {

	public static void main(String[] args) {

		// 配置多個錯誤類別 catch 這些類別若有繼承關係時 , 要先配置子類別再配置父類別
		try {

		} catch (ArithmeticException e) {
			System.out.println("數學錯誤");
		} catch (NullPointerException e) {
			System.out.println("空指標錯誤");
		} catch (Exception e) {
			System.out.println("其它錯誤");
		}

		// 利用 | 進行統一錯誤處理
		// 但是透過 | 不可存在父子類別關係
		try {
			// block of code
			// } catch (ArithmeticException|NullPointerException|RuntimeException e) { // 錯誤

		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("統一處理: 數學錯誤與空指標錯誤");
		} catch (Exception e) {
			System.out.println("其它錯誤");
		}

	}

}
