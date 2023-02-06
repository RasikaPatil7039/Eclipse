package com.aurionpro.model;

public class Circle {
	private double radius;
	private BorderType border;

	public Circle(double radius, BorderType border) {
		this.radius = radius;
		this.border = border;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public BorderType getBorder() {
		return border;
	}

	public void setBorder(BorderType border) {
		this.border = border;
	}

	public double calculateArea() {
		return 3.14 * radius * radius;
	}
}
