package com.aurionpro.model;

public class Boy extends Man {
	
	public void read() {       
		System.out.println("boy is reading");

	}
	@Override
	public void eat() {
		System.out.println("boy eats");
	}
	@Override
	public void play() {
		System.out.println("boy playing");
	}
}
