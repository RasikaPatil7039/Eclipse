package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {
		String[] names = { "jay", "nimesh", "mahesh", "mark", "ramesh" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));

		List<String> numlist = Arrays.asList("jay", "nimesh", "mahesh", "mark", "ramesh");
		List<String> collect = numlist.stream().filter(n -> n.length() <= 4).collect(Collectors.toList());
		System.out.println(collect);
	}
}