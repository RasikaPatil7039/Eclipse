package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("rasika");
		deque.add("rutuja");

		deque.addFirst("first");
		deque.addLast("last");

		for (String str : deque) {
			System.out.println(str);
		}

		String element = deque.poll();
		System.out.println("removed element: " + element);
		System.out.println("new array is: " + deque);

		deque.clear();
		System.out.println(deque);

	}

}
