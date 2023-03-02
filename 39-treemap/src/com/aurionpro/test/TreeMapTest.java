package com.aurionpro.test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Integer>treeMap=new TreeMap<String, Integer>();
		treeMap.put("rasika", 1);
		treeMap.put("krutika", 2);
		treeMap.put("rutuja", 3);
		System.out.println(treeMap);
		
		System.out.println(treeMap.containsKey("rasika"));
		
		treeMap.replace("rutuja", 100);
		System.out.println(treeMap);
		
		treeMap.remove("krutika");
		System.out.println(treeMap);
		
		
	}

}
