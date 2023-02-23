package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		List<LineItem> list = new ArrayList<>();
		
		LineItem obj = new LineItem(1, "parleG", 5, 10);
		LineItem obj1 = new LineItem(2, "chocolate", 10, 10);
		LineItem obj2 = new LineItem(3, "gems", 6, 20);
		LineItem obj3 = new LineItem(4, "marie", 4, 30);

		
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		
		//System.out.println(list);
		
//		System.out.println(obj +" "+"total price of parleG :"+obj.calculateCost());
//		System.out.println(obj1 +" "+" total price of chocolate :"+obj1.calculateCost());
//		System.out.println(obj2+" "+"total price of gems :"+obj2.calculateCost());
//		System.out.println(obj3+" "+"total price of marie :"+obj3.calculateCost());
	
		double totalcartcost=0;
		for(LineItem x:list) {
			System.out.println(x);
			totalcartcost+=x.calculateCost();
			System.out.println("totalcost ofcart :" +totalcartcost);
		}
	}

}
