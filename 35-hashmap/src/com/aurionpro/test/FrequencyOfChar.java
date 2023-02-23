package com.aurionpro.test;

import java.util.*;
import java.io.*;

public class FrequencyOfChar {

	public static void main(String[] args) {
		// String str="rasika";
		HashMap<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String input = sc.next();
		for (Character c : input.toLowerCase().toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}

		map.forEach((key, value) -> System.out.println(key + " :" + value));

	}

}
