package com.aurionpro.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
	public static void main(final String[] arguments) throws InterruptedException {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		// Starts before tasks execution
		System.out.println("Maximum allowed threads: " + executor.getMaximumPoolSize());
		System.out.println("Current threads in pool: " + executor.getPoolSize());
		System.out.println("Currently executing threads: " + executor.getActiveCount());
		System.out.println("Total number of threads: " + executor.getTaskCount());

		executor.submit(new Task());
		executor.submit(new Task());

		System.out.println("---------------");

		// Starts after tasks execution
		System.out.println("Current threads in pool: " + executor.getPoolSize());
		System.out.println("Currently executing threads: " + executor.getActiveCount());
		System.out.println("Total number of threads: " + executor.getTaskCount());

		executor.shutdown();
	}

	static class Task implements Runnable {

		public void run() {
			System.out.println("Running Task! Thread Name: " + Thread.currentThread().getName());
			System.out.println("Task Completed! Thread Name: " + Thread.currentThread().getName());
		}
	}
}
