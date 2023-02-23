package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {
		List<Integer> numlist = Arrays.asList(10, 23, 20, 33, 4, 30);

		// using collections
		Collections.sort(numlist, Collections.reverseOrder());
		System.out.println(numlist);

		List<String> namelist = Arrays.asList("rasika", "asha", "nisha");
		Collections.sort(namelist);
		System.out.println(namelist);

		// using stream
		List<Integer> collect = numlist.stream().sorted(Collections.reverseOrder()).filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
