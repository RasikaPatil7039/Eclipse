package com.aurionpro.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHahSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<>();
		linkedset.add("rasika");
		linkedset.add("krutika");
		linkedset.add("a");
		linkedset.add("z");
		System.out.println(linkedset);
		
		System.out.println("size of array: "+linkedset.size());
		System.out.println("remove z from array: "+linkedset.remove("z"));
		System.out.println("remove rutuja from array: "+linkedset.remove("rutuja"));
		System.out.println("check rasika is present in array: "+linkedset.contains("rasika"));
		
		Iterator itr=linkedset.iterator();
		System.out.println(itr.next());
		for(String s:linkedset)
			System.out.println(s);
	}
}
