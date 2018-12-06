package com.cts.java8.examples;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> findWordCount = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {

				return t.split(" ").length;
			};

		};

		Function<Integer, String> numberToString = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				switch (t.intValue()) {
				case 0:
					return "zero";
				case 1:
					return "One";
				case 2:
					return "Two";
				case 3:
					return "Three";
				case 4:
					return "Four";
				default:
					return "Number";
				}

			};

		};
		
		Integer count = findWordCount.apply("Hello to Java8 Examples");
		
		System.out.println(count);
		
		System.out.println(numberToString.apply(count));

	}

}
