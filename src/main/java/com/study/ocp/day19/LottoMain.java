package com.study.ocp.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LottoMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newCachedThreadPool();
		Collection<Callable<Map<String, Integer>>> collection = new ArrayList<>();

		collection.add(new Lotto("John"));
		collection.add(new Lotto("Mary"));
		collection.add(new Lotto("Bobo"));
		collection.add(new Lotto("Helen"));
		collection.add(new Lotto("Angle"));

		List<Future<Map<String, Integer>>> results = service.invokeAll(collection);
		for (Future<Map<String, Integer>> future : results) {
			System.out.println(future.get());
		}
		System.out.println(Thread.activeCount());

		System.out.println("========================================");

		Map<String, Integer> map = service.invokeAny(collection);
		System.out.println(map);
		System.out.println(Thread.activeCount());

	}

}
