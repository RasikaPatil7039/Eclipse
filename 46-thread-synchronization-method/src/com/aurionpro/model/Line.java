package com.aurionpro.model;

public class Line {
	synchronized public void getLine() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);

		}
	}
}
