package com.aurionpro.test;

import com.aurionpro.model.Animal;
import com.aurionpro.model.Cow;
import com.aurionpro.model.Lion;

public class AnimalTest {

	public static void main(String[] args) {
		Animal obj = new Animal("wild animal", true);
		System.out.println(obj);
		obj.eat();

		Cow obj1 = new Cow("cow", false);
		System.out.println(obj1);
		obj1.eat();

		Lion obj2 = new Lion("lion", true);
		System.out.println(obj2);
		obj2.eat();
	}

}
