package com.aurionpro.test;

import java.util.ArrayList;

import java.util.Arrays;

import com.aurionpro.model.IName;

public class HomeWork {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("jayesh");
		names.add("nimesh");
		names.add("mahesh");
		names.add("ramesh");

		for (String x : names) {
			System.out.println(x);
		}

		System.out.println("----------");
		names.stream().forEach(System.out::println);

		Arrays.asList(names).forEach(System.out::println);

		IName obj=HomeWork::welcome;
		obj.Named("abc");
	}
	
	public static void welcome(String name) {
		System.out.println("welcome" +name );
	}

}
