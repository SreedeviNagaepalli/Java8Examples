package com.cts.java8.examples;

import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithRange {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("OS", "scala", "java");
		//stringStream.forEach(System.out::println);

		Stream<Double> streamDouble = Stream.of(3.5, 5.6);
		//streamDouble.forEach(System.out::println);
		
		DoubleStream doubleStream = DoubleStream.of(3.5, 5.6);
		//doubleStream.forEach(System.out::println);
		
		IntStream intStream = IntStream.range(10, 25).skip(10);
		//intStream.forEach(System.out::println);
		
		OptionalInt optional = intStream.max();
		Integer max = optional.getAsInt();
		System.out.println(max);

	}

}
