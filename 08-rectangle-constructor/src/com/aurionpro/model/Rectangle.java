package com.aurionpro.model;

public class Rectangle {
	private int height;
	private int width;
	private Color color;

	public Rectangle(int height, int width, Color color) { // constructor
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public Rectangle(int width, int height) {
		this(width, height, Color.green);
	}

	public Rectangle() {
		this(5, 10, Color.green);
	}

	public Color getColor() { // gettersetter
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getHeight() {
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

		return height * width;

	}

}
