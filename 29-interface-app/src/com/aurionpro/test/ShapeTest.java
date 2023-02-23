package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(5, 10);
		System.out.println(obj.calculateArea());
		obj.showColor();
	}

}
