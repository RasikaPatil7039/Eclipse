package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

public class lowerboundwildcard {//super keyword

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3, 4, 5);
		printlist(list1);

		List<Number> list2 = Arrays.asList(5, 6, 7);
		printlist(list2);

	}

	private static void printlist(List<? super Integer> list) {
		System.out.println(list);

	}

}
