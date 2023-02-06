package com.aurionpro.test;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle obj=new Circle(4, BorderType.solid);
		System.out.println("radius :"+obj.getRadius());
		System.out.println("bordertype :"+obj.getBorder());
		System.out.println("area of circle is :"+obj.calculateArea());

		Circle obj1=new Circle(6,BorderType.dashed);
		printCircleDetails(obj1);
		//System.out.println("radius :"+obj1.getRadius());
		//System.out.println("bordertype :"+obj1.getBorder());
		//System.out.println("area of circle is :"+obj1.calculateArea());
		
	}

	private static void printCircleDetails(Circle obj1) {  //printcirclemethodcreated if we have same line of code add similar lines in this
		System.out.println("radius :"+obj1.getRadius());
		System.out.println("bordertype :"+obj1.getBorder());
		System.out.println("area of circle is :"+obj1.calculateArea());
		
	}

}
