package com.aurionpro.test;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("original array: "+arr[i]);
			System.out.println(arr[i] + " ");
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("reverse array :" + arr[i]);
		}

	}

}
