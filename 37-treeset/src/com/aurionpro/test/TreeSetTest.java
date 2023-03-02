package com.aurionpro.test;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer>evenno=new TreeSet<>();
		evenno.add(2);
		evenno.add(4);
		evenno.add(6);
		System.out.println("treeset is: "+evenno);
		
		TreeSet<Integer>number=new TreeSet<>();
		number.add(100);
		number.addAll(evenno);    //inserts all elements of that specified collection(evenno) to current set
		System.out.println("new treeset is: "+number);
		
		System.out.println(number.remove(2));
		System.out.println(number.contains(6));
		System.out.println(number.higher(4));
		System.out.println(number.lower(6));
		System.out.println(number.ceiling(4));
		System.out.println(number.floor(5));
	}
}
