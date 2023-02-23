package com.aurionpro.model;

public class Rectangle implements Shape {

	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	public double calculateArea() {

		return length * breadth;
	}

	@Override
	public void showColor() {
		System.out.println("the color is red..");
	}

}
