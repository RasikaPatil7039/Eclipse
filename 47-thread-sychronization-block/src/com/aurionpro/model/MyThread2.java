package com.aurionpro.model;

public class MyThread2 extends Thread {
	Line line;

	public MyThread2(Line line) {
		super();
		this.line = line;
	}
	
	public void run() {
		line.print();
	}
}
