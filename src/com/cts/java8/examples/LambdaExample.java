package com.cts.java8.examples;

import java.util.Calendar;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {

	public static void main(String[] args) {

		/*Function<String, Integer> findWordCount = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.split(" ").length;
			};

		};
*/		
		
		Function<String, Integer> findWordCount =  s -> s.split(" ").length;;
		
		Integer t = findWordCount.apply("asfa afasf");
		
		System.out.println(t);
		
		Predicate<String> sizeChecker = i -> i.length() <50;
		
		System.out.println(sizeChecker.test("fdkgjdfgljd"));
		
		Supplier<Calendar> calendarSupplier = () -> Calendar.getInstance();
		
		System.out.println(calendarSupplier.get().getTime());

	}

}
