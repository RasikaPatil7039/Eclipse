package com.aurionpro.test;

public class checkedTest {

	public static void main(String[] args) {
		method1();
		System.out.println("main");

	}

	private static void method1() {
		try {
			method2();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("method 1");

	}

	private static void method2() {
		method3();
		System.out.println("method 2");
	}

	private static void method3()  {
		throw new RuntimeException("an error occured..");

	}

}
