package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account(1, "rasika", 4000);
		printAccountDetails(obj);
		withdraw(obj, 100);
		deposit(obj, 500);
		// obj.withdraw(3000);
		// printAccountDetails(obj);
	}

	private static void withdraw(Account obj, int amount) {
		if (obj.withdraw(amount)) {
			System.out.println("withdraw successfully:");
			System.out.println("accountnumber:" + obj.getAccountnumber());
			System.out.println("balance :" + obj.getBalance());
		} else {
			System.out.println("invalid");
		}
		System.out.println("----------------");
	}

	private static void deposit(Account obj, int amount) {
		if (obj.deposit(amount)) {
			System.out.println("deposited successfully");
			System.out.println("accountnumber:" + obj.getAccountnumber());
			System.out.println("balance :" + obj.getBalance());
		} else {
			System.out.println("transaction failed");
		}

	}

	private static void printAccountDetails(Account obj) {
		
		System.out.println("accountnumber :" + obj.getAccountnumber());
		System.out.println("deposit :" + obj.getName());
		System.out.println("withdraw :" + obj.getBalance());
	}
	

}
