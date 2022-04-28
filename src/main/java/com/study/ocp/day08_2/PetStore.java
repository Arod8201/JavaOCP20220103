package com.study.ocp.day08_2;

import java.util.stream.Stream;

public class PetStore {

	public static void main(String[] args) {

		Dog[] dogs = { new Shiba(), new Chihuahua(), new EDog() };
		Stream.of(dogs).forEach(PetStore::print);

	}

	public static void print(Dog dog) {
		System.out.println(dog.getClass().getSimpleName());
		dog.eat();
		dog.skill();
		System.out.println("===============");
	}

}
