package com.cts.java8.examples;

import java.util.Optional;
import java.util.function.Function;

public class OptionalExample {

	public static void main(String[] args) {

		Function<String, String> getSecondWord = (String s) -> {
			return s.split(" ").length > 1 ? s.split(" ")[1] : null;
		};

		Function<String, Integer> getLetterCount = t -> t.length();

		// Integer count = getSecondWord.andThen(getLetterCount).apply("hassadh ");

		// System.out.println(count);
		
		Optional<String> myOptional = Optional.ofNullable(getSecondWord.apply("jafg sdkjfczx"));
		
		/*if(myOptional.isPresent())
		{
			String s = myOptional.get();
			myOptional.ifPresent(System.out ::println);
			System.out.println("Our value :"+s);
		}
		else
		{
			String s = myOptional.orElse("no else");
			System.out.println(s);
		}*/
		
		Optional.ofNullable(getSecondWord.apply("jafg sdkjfczx")).ifPresent(System.out ::println);
		
		Optional.ofNullable(getSecondWord.apply("jafg ")).map(getLetterCount).ifPresent(System.out ::println);

	}

}
