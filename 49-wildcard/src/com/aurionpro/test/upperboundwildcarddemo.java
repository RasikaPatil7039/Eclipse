package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

public class upperboundwildcarddemo {//extends keyword
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		System.out.println("total sum is: " + sum(list1));

		List<Double> list2 = Arrays.asList(1.15, 4.2, 3.3);
		System.out.println("total sum is: " + sum(list2));

	}

	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}
		return sum;
	}
}
