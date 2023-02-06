package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10, 20);
		printRectangleDetails(obj);

		Rectangle obj1 = new Rectangle(5,6,Color.blue);
		//obj1.setHeight(2);
		//obj1.setWidth(4);
		printRectangleDetails(obj1);
		
		Rectangle obj3 = new Rectangle(10, 15);
		printRectangleDetails(obj3);

	}

	private static void printRectangleDetails(Rectangle obj) {
		System.out.println("width :" + obj.getWidth());
		System.out.println("height :" + obj.getHeight());
		System.out.println("color :" + obj.getColor());
		System.out.println("area :" + obj.calculateArea());

	}

}
