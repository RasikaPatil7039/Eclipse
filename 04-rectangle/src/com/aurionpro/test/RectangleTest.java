package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();// object created
		System.out.println(obj.height); //through object we call members
		System.out.println(obj.color);
		obj.height = 10;
		obj.width = 15;
		obj.color = "red";
		System.out.println(obj.height);
		System.out.println(obj.width);
		System.out.println(obj.color);

		
		Rectangle obj1 = new Rectangle();// object created
		//System.out.println(obj1.height); //through object we call members
		//System.out.println(obj1.color);
		obj1.height = 20;
		obj1.width = 30;
		System.out.println(obj1.width); //through object we call members
		System.out.println(obj1.height);
	}

}
