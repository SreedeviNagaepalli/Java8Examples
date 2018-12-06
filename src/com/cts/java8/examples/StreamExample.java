package com.cts.java8.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<Integer>();
		
		mySet.add(10);
		mySet.add(20);
		mySet.add(30);
		mySet.add(40);
		mySet.add(50);
		mySet.add(60);
		mySet.add(70);
		mySet.add(80);
		
		Stream<Integer> stream = mySet.stream();
		stream.sorted((first,second) -> (second - first)).forEach(System.out::println);
		
		Set<Integer> myTreeSet = new TreeSet<Integer>();
		
		myTreeSet.add(10);
		myTreeSet.add(20);
		myTreeSet.add(30);
		myTreeSet.add(40);
		myTreeSet.add(50);
		myTreeSet.add(60);
		myTreeSet.add(70);
		myTreeSet.add(80);
		
		myTreeSet.stream().forEach(System.out::println);
		
		

	}

}
