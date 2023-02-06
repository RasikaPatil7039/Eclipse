package com.aurionpro.model;

import java.util.Arrays;

public class Array {

	public int max(int arr[]) { // maximum
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public int min(int arr[]) { // minimum
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	public int sum(int arr[]) { // sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;

	}
	public float average(int arr[]) { // average
		float average = (float) 0.0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int length = arr.length;
			sum = sum + arr[i];
			average = sum / length;
		}
		return average;
	}
	public double median(int arr[], int n) { // median
		Arrays.sort(arr);

		if (n % 2 != 0) {
			return (double) arr[n / 2];// oddnumber
		}
		return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0; // evennumber
	}
	public static int frequency(int arr[], int n) {
		System.out.println("count frequencyof each number is:");
		boolean visited[] = new boolean[n];
		Arrays.fill(visited, false);
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
		return n;
	}
}