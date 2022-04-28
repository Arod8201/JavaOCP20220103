package com.study.ocp.day07.drinkstore;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Stream;

public class DrinkStore {

	public static void main(String[] args) {

		Drink d1 = new RedTea();
		Drink d2 = new Coffee();
		Drink d3 = new Milk();
		System.out.println(d1.getName());
		System.out.println(d1.getPrice());
		System.out.println("====================");

		Drink[] drinks = { d1, d2, d2, d3, d3, d3 };
		// 利用 java 8 stream 求總價與均價 = ?
		// 1.
		int sumOfPrice =
		Arrays.stream(drinks)
			  .mapToInt(Drink::getPrice)
			  .sum();
		System.out.printf("總價: $%d\n",sumOfPrice);
		
		double avgOfPrice =
		Arrays.stream(drinks)
			  .mapToInt(Drink::getPrice)
			  .average()
			  .getAsDouble();
		System.out.printf("均價: $%.1f\n",avgOfPrice);
		System.out.println("====================");
		
		// 2.
		IntSummaryStatistics stat = Stream.of(drinks)
										  .mapToInt(Drink::getPrice)
										  .summaryStatistics();
		System.out.printf("總價: $%d\n均價: $%.1f\n",stat.getSum(),stat.getAverage());
		System.out.println("====================");
		
		DrinkService service = new DrinkService();
		//service.print(d3);
		System.out.println("====================");
		Stream.of(drinks).map(d -> (Drink) d).forEach(DrinkService::print);
		//Stream.of(drinks).forEach(d -> service.print(d));
		System.out.println("====================");
		
		// 兌獎
		Optional<Drink> optional = service.getRandomDrink();
		// 請問我抽到的飲料名稱是 ?
		if (optional.isPresent()) {
			Drink drink = optional.get();
		System.out.println(drink.getName());
		}else {
			System.out.println("銘謝惠顧 !!");
		}	
	}

}
