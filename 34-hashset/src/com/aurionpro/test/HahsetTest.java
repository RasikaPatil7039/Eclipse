package com.aurionpro.test;

import java.util.HashSet;

public class HahsetTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.println(set);

		for (Integer i : set) { // enhanced forloop
			System.out.println(i);
		}

		set.remove(10);
		System.out.println(set);

		System.out.println(set.contains(30));
	}
}
