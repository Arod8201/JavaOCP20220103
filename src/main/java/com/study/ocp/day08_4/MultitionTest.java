package com.study.ocp.day08_4;

import java.util.stream.Stream;

public class MultitionTest {
	
	public static void main(String[] args) {
		
		Multition[] multitions = {
				Multition.getInstance(),
				Multition.getInstance(),
				Multition.getInstance(),
				Multition.getInstance(),
				Multition.getInstance(),
				Multition.getInstance()
		};
		
		Stream.of(multitions).forEach(m -> System.out.println(m.getNum()));
		
	}

}
