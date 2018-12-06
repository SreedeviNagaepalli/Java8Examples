package com.cts.java8.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<Player> playerList = new ArrayList<Player>();
		
		playerList.add(new Player(1,2,3,4));
		playerList.add(new Player(3,5,8,10));
		playerList.add(new Player(4,6,2,8));
		playerList.add(new Player(2,0,3,20));
		playerList.add(new Player(1,4,3,12));
		
		Stream<Player> playerStream = playerList.stream();
		playerStream.forEach(t -> System.out.println("match :"+t.matchCount));
		
		System.out.println("------------------------");
		
		playerStream = playerList.stream();
		
		playerStream.filter(p -> p.matchCount >5)
		.filter(p -> p.score > 2)
		.forEach(t -> System.out.println("match :"+t.matchCount));
		
		

	}

}
