package com.aurionpro.model;

public class Rectangle {
	private int height;
	private int width;

	public Rectangle(int height, int width) { // constructor
		this.height = height;
		this.width = width;
	}

	public Rectangle() {

	}

	public int getHeight() { // gettersetter
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double calculateArea() { // methodtocalculatearea
		double area;
		area = height * width;
		return area;
	}

}
