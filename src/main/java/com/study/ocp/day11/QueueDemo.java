package com.study.ocp.day11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		// Queue -> 先進先出 FIFO
		Queue<String> jobs = new LinkedList<>();
		jobs.offer("熱鍋");
		jobs.offer("下油");
		jobs.offer("放蛋");
		jobs.offer("倒飯");
		jobs.offer("盛出");
		System.out.println(jobs);
		while (!jobs.isEmpty()) {
			String job = jobs.poll();
			System.out.println(job);
		}
		System.out.println(jobs);
	}

}
