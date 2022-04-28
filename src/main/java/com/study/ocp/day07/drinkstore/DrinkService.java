package com.study.ocp.day07.drinkstore;

import java.util.Optional;
import java.util.Random;

// 飲料服務
public class DrinkService {

	// 印出飲料資料
	public static void print(Drink drink) {
		System.out.printf("飲料名: %s 價格: $%d\n", drink.getName(), drink.getPrice());
	}

	// 隨機兌換飲料一杯
	public Optional<Drink> getRandomDrink() {
		Random r = new Random();
		Optional<Drink> drink = Optional.ofNullable(null);
		switch (r.nextInt(10)) { // 0 ~ 10
		case 0:
		case 1:
		case 2:
				drink = Optional.of(new RedTea());
				break;
		case 3:
				drink = Optional.of(new Coffee());
				break;
		case 4:
		case 5:
				drink = Optional.of(new Milk());
				break;
		}
		return drink;
	}

}
