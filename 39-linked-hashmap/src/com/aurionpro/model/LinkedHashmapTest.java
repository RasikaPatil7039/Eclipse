package com.aurionpro.model;

import java.util.LinkedHashMap;

public class LinkedHashmapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("ajay", 1);
		map.put("vijay", 2);
		map.put("sujay", 3);
		System.out.println(map);
		
		System.out.println(map.containsKey("ajay"));
		
		
		map.replace("sujay", 55);
		System.out.println(map);
		
		map.remove("vijay");
		System.out.println(map);

	}

}
