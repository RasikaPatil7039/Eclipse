package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {
		List<Integer> List1 = Arrays.asList(2, 5, 7, 8);
		List<Integer> List2 = Arrays.asList(3, 6, 9);
		List<Integer> List3 = Arrays.asList(2, 5, 11);

		// merged all abovelist in single list
		List<Integer> merged = new ArrayList<Integer>();
		merged.addAll(List1);
		merged.addAll(List2);
		merged.addAll(List3);
		System.out.println(merged);

		// merged all abovelist in single list but seperated fromeachother
		// listoflist
		List<List<Integer>> merged2 = new ArrayList<List<Integer>>();
		merged2.add(List1);
		merged2.add(List2);
		merged2.add(List3);
		System.out.println(merged2);

		// took merged2 list as input and merged in a singlelist combined
		List<Integer> merged3 = new ArrayList<Integer>();
		for (List<Integer> l : merged2) {
			for (Integer i : l) {
				if (!merged3.contains(i)) //to have distinctvalue
					merged3.add(i);
			}
		}
		System.out.println(merged3);

		// merged2 as input and used stream,flatmap and merged to singlelist
		List<Integer> collect = merged2.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(collect);

		// disntinct
		List<Integer> collect1 = merged2.stream().flatMap(list -> list.stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(collect1);
	}
}
