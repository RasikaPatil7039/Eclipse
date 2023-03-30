package com.aurionpro.model;

public class Line {
	void print(){
		
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}

		}
	}
}