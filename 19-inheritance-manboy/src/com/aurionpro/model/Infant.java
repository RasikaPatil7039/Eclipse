package com.aurionpro.model;

public class Infant extends Man {

	public void read() { 
		System.out.println("infant is reading");

	}

	@Override
	public void eat() {
		System.out.println("infant eats");
	}

	@Override
	public void play() {
		System.out.println("infant playing");
	}
}
