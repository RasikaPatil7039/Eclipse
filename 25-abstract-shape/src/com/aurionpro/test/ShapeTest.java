package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle obj = new Circle(Color.blue, 2);
		System.out.println("area of circle is: " + obj.calculateArea());

		Rectangle obj1 = new Rectangle(Color.green, 10, 20);
		System.out.println("area of rectangle is: " + obj1.calculateArea());

	}

}
