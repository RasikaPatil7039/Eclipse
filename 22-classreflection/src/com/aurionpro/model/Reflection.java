package com.aurionpro.model;

public class Reflection {
	private String s;


	public Reflection() {
		this.s = "rasika";
	}
	
	public void method1() {
		System.out.println("this string is : "+s);
		
	}

	public void method2(int n) {
		System.out.println(n);
		
	}
	private void method3() {
		System.out.println("private method");
	}

}


