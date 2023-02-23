package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.Person;

public class BMITest {

	public static void main(String[] args) {
		Person obj = new Person("rasika", 23, 2, 80);

		BMI obj2 = new BMI(obj);

		System.out.println("your bmi is " +obj2.getBmi());

		obj2.getBodyType();

	}

}
