package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

public class unboundedwildcard {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 8, 2);
		printlist(list1);

		List<Double> list2 = Arrays.asList(5.2, 6.9, 0.5);
		printlist(list2);

	}

	private static void printlist(List<?> list) {
		System.out.println(list);

	}

}
