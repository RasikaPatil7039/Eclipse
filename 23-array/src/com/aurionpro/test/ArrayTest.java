package com.aurionpro.test;

import com.aurionpro.model.Array;

public class ArrayTest {

	public static void main(String[] args) {
//		int arr[]= new int[5];
//		arr[0]=76;
//		arr[1]=35;
//		arr[2]=12;
//		arr[3]=24;
//		arr[4]=16;

		int arr[] = new int[] { 1, 30, 86, 46, 1, 18 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ARRAY IS : "+arr[i]);
		}
		int n = arr.length;
		Array obj = new Array(); // class object created
		System.out.println("maximum value is:" + obj.max(arr));
		System.out.println("minimum value is:" + obj.min(arr));
		System.out.println("sum is:" + obj.sum(arr));
		System.out.println("average is:" + obj.average(arr));
		System.out.println("median is :" + obj.median(arr, n));
		System.out.println("total number present in array  :" + obj.frequency(arr, n));

	}

}
