package com.aurionpro.test;

public class ThreadAnonymous {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				System.out.println("anonymous thread");
			}
		};
		t.start();
	}

	@Override
	public String toString() {
		return "ThreadAnonymous []";
	}

}
