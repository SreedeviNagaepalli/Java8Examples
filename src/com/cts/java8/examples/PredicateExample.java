package com.cts.java8.examples;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> sizeChecker = new Predicate<String>() {
			public boolean test(String t) {
				return t.length() < 50;
			};
		};

		Predicate<String> specialWordChecker = new Predicate<String>() {
			public boolean test(String t) {
				return t.contains("Download");
			};
		};

		String text = "Download Java Functional Programming";

		boolean isProper = sizeChecker.test(text);

		System.out.println(isProper);

		isProper = sizeChecker.negate().and(specialWordChecker).test(text);
	}

}
