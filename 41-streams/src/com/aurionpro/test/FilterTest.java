package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		// arraylist created
		List<Integer> numberlist = Arrays.asList(10, 12, 20, 48, 30);

		System.out.println(numberlist);
		for (Integer x : numberlist) {
			if (x % 10 == 0) {
				System.out.println(x);
			}
		}
		//newarraylist created and added only no.divisible by10
		List<Integer> divisibleby10 = new ArrayList<Integer>();
		for (Integer x : numberlist) {
			if (x % 10 == 0) {
				divisibleby10.add(x);
			}
		}
		System.out.println(divisibleby10);
		
		//same above task but with stream arraylist converted to stream 
		numberlist.stream().filter(n->n%10==0).forEach(System.out::println);
		
		List<Integer> collect = numberlist.stream().filter(n->n%10!=0).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> friends = Arrays.asList("ajay","vijay","sujay","ravi");
		List<String> collect2 = friends.stream().filter(n->n.length()>=5).collect(Collectors.toList());
		System.out.println(collect2);
			
		}
		
	}


