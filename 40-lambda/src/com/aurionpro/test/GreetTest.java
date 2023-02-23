package com.aurionpro.test;

import com.aurionpro.model.IGreetable;

public class GreetTest {

	public static void main(String[] args) {
		// lambda
		IGreetable obj = (String name) -> System.out.println("hello" + name);
		obj.greet("rasika");

		// method reference
		IGreetable obj2 = GreetTest::welcome;
		obj2.greet("abc");

		GreetTest gr = new GreetTest();
		IGreetable obj3 = gr::helloAll;
		obj3.greet("xyz");

	}

	// method reference
	public static void welcome(String name) {
		System.out.println("welcome" + name);
	}

	public void helloAll(String name) {
		System.out.println("hello " + name);
	}
	
}