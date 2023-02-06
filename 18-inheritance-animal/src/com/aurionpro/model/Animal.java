package com.aurionpro.model;

public class Animal {
	private String name;
	private boolean isCarnivorous;

	
	public void eat() {
		System.out.println("animal is eating");
	}


	public Animal(String name, boolean isCarnivorous) { //constructor
		super();
		this.name = name;
		this.isCarnivorous = isCarnivorous;
	}


	public String getName() {   //gettersetter
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", isCarnivorous=" + isCarnivorous + "]";
	}


	public boolean isCarnivorous() {
		return isCarnivorous;
	}


	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

}
