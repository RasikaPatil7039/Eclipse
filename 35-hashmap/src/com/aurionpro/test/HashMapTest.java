package com.aurionpro.test;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("rasika", 10);
		map.put("krutika", 20);
		map.put("rutuja", 30);

		System.out.println(map);

		map.remove("rutuja", 30);
		System.out.println("after deleted : " + map);

		// entryset method
		// Set<Entry<String, Integer>> entrySet = map.entrySet(); //autogenerate by
		// writing first map.entryset than somethimg generate than ctrl+1
		for (Entry<String, Integer> set : map.entrySet()) {
			System.out.println(set.getKey() + " : " + set.getValue());
		}

		map.forEach((key, value) -> System.out.println(key + " : " + value));

		for(String x:map.keySet()) {
			System.out.println(x + " : " +map.get(x));
		}
		
		if (map.containsKey("rasika")) {
			Integer a = map.get("rasika");
			System.out.println("value for key rasika is: " + a);
		}
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();  //if thta specific key found than delete it
		while (iterator.hasNext()) {
		    if (iterator.next().getKey().equals("rasika"))
		        iterator.remove();
		}
		System.out.println(map);
		
		}
	
	
	
	
	}

