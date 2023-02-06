package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangles[]=new Rectangle[5];
		for (int i=0;i<5;i++) {
			rectangles[i]=new Rectangle(10+i,20+i);
		}
		for(Rectangle x:rectangles) {
			//printRectangles(x);
			System.out.println(x);
		}

	}

	/*private static void printRectangles(Rectangle x) {
		System.out.println("height is: "+x.getHeight());
		System.out.println("width is :"+x.getWidth());
		System.out.println("area is: "+x.calculateArea());
		System.out.println("----------");
	}
*/
}






