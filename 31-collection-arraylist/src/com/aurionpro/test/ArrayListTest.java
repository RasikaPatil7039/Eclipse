package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest { // arraylist is used as a dynamic it does not has fixed size

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(10);
		list.add(15);
		System.out.println(list); // prints whole arraylist

		System.out.println(list.size());// size of array

		for (Integer i : list) { // enhanced forloop
			System.out.println(i);
		}

		for (int i = 0; i < list.size(); i++) { // traditional forloop
			System.out.println(list.get(i));
		}

		Iterator<Integer> it = list.iterator(); // traverse using iterator
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// to delete elements

		list.remove(0); // delete using indexof array

		list.remove(new Integer(15));
		System.out.println(list);

		System.out.println(list.contains(10));
	}

}
