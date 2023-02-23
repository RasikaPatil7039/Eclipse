package com.aurionpro.test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer>numbers=new PriorityQueue<>();
		numbers.add(10);
		numbers.offer(20);
		System.out.println(numbers);
		
		for(Integer i:numbers) {
			System.out.println(i);
		}
		
		int num=numbers.peek();
		System.out.println(num);
		

	}

}
