package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
	}

	private static void case4() {  //autoboxing
		System.out.println("case 4........");
		Object x;
		x = 100;      //automaticly x value is converted to int
		System.out.println(x.getClass());
		x = "hello";
		System.out.println(x.getClass());
		x=10>20;
		System.out.println(x.getClass());

	}

	private static void case3() {       //polymorphism one method can hold many
		System.out.println("case 3.......");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}

	private static void atThePark(Man man) {
		man.play();

	}

	private static void case2() {
		System.out.println("case 2......");
		Man man = new Boy(); // reference is of parent and object is childclass
		man.eat(); // in this we cannot call methods of parent class and method that are not in
					// parentclass
		man.play();

	}

	private static void case1() {
		System.out.println("case 1......");
		Boy obj = new Boy();
		obj.eat();
		obj.read();
		obj.play();

		Kid kid = new Kid();
		kid.eat();
		kid.play();
	}

}
