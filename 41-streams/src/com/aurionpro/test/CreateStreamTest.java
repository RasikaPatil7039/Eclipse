package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class CreateStreamTest {

	public static void main(String[] args) {
		// int[] numbers = { 10, 20, 30, 40, 50 };
		Stream<Integer> stream = Stream.of(10, 20, 30);
		stream.forEach((n) -> System.out.println(n));

		Stream<String> stringstream = Stream.of("rasika", "rutuja");
		stringstream.forEach((n) -> System.out.println(n));
		
		//created arraylist and converted to stream and than to uppercase
		List<String> players = Arrays.asList("abc", "cgf");
		// players.forEach(System.out::println);
		players.stream().forEach(System.out::println);
		List<String> playerUpper = new ArrayList<String>();
		for (int i = 0; i < players.size(); i++) {
			playerUpper.add(players.get(i).toUpperCase());
		}
		System.out.println(playerUpper);

		// stream of string
		Stream<String> javaStream = Stream.generate(() -> "java").limit(5);
		javaStream.forEach(System.out::println);

		// stream of int
		Stream<Integer> number = Stream.iterate(1, n -> n + 1).limit(5);
		number.forEach(System.out::println);
		
		//builder method
		Stream.Builder<String> builder = Stream.builder();
		Stream<String> build = builder.add("rasika")
									.add("krutika")
									.add("rutuja")
									.build();
		build.forEach(System.out::println);

	}

}
