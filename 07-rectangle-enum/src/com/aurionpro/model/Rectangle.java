package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private Color color;

	public void setHeight(double height) {
		this.height = getcorrectedValues(height);
	}

	private double getcorrectedValues(double num) { // dry method
		if (num < 1) {
			return 1;
		}
		if (num > 100) {
			return 100;
		}
		return num;
	}

	public double getHeight() {
		return height;

	}

	public void setWidth(double wt) {
		this.width = wt;
	}

	public double getWidth() {
		return width;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}