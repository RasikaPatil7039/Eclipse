package com.aurionpro.test;

public class ThreadLambda {

	public static void main(String[] args) {
		Runnable mythread = () -> {
			Thread.currentThread().getName();
			System.out.println(Thread.currentThread().getName() + " is running");
		};

		Thread obj1 = new Thread(mythread);
		Thread obj2 = new Thread(mythread);
		
		obj1.start();
		obj2.start();
		

	}

}
