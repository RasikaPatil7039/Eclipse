package com.aurionpro.test;

import java.util.Scanner;

public class IntToBinary {

	public static void main(String[] args) {
		// int num=44;
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("binary no. is: " + Integer.toBinaryString(num));
		System.out.println("octal no is " + Integer.toOctalString(num));
		System.out.println("hexadecimal no. is " + Integer.toHexString(num));

	}

}
