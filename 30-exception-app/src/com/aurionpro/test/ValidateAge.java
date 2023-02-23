package com.aurionpro.test;

import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		try {
			validateUserAge(age);

		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of code..");

	}

	private static void validateUserAge(int age) throws InvalidAgeException {
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			throw new InvalidAgeException("under age");
		}
	}

}
