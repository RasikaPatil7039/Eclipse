package com.aurionpro.test;

public class ThreadRunnableInterfaceTest implements Runnable{

	
	public static void main(String[] args) {
		ThreadRunnableInterfaceTest obj=new ThreadRunnableInterfaceTest();
		Thread t1=new Thread(obj);
		t1.start();
		System.out.println("hello");
	}

	@Override
	public void run() {
		System.out.println("thread ended");
		System.out.println(Thread.currentThread().getName());
	}

}
