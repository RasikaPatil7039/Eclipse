package com.aurionpro.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i, fact = 1;
		// int n=4; //user input
		System.out.println("enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of no. is " + fact);

	}

}
