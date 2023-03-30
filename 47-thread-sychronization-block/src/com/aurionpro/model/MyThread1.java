package com.aurionpro.model;

public class MyThread1 extends Thread{
	Line line;

	public MyThread1(Line line) {
		super();
		this.line = line;
	}
	
	public void run() {
		line.print();
	}

}
