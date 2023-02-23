package com.aurionpro.test;

import com.aurionpro.model.AddInteger;

import com.aurionpro.model.IAddable;

public class AddTest {

	public static void main(String[] args) {
		AddInteger obj = new AddInteger();
		System.out.println(obj.add(10, 20));

		// anonymous class
		IAddable obj2 = new IAddable() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		System.out.println(obj.add(40, 20));

		// lambda
		IAddable obj3 = (a, b) -> {
			return a + b;
		};
		System.out.println(obj.add(70, 20));
	}

}
