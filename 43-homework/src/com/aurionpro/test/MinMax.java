package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 45);
		Integer max = num.stream().max(Integer::compare).get();
		System.out.println(max);

		Integer min = num.stream().min(Integer::compare).get();
		System.out.println(min);
	}

}
