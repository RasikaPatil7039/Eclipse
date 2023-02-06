package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account(1, "rasika", 4000);
		printAccountDetails(obj);

		obj.withdraw(3000);
		printAccountDetails(obj);

	}

	private static void printAccountDetails(Account obj) {
		System.out.println("accountnumber :" + obj.getAccountnumber());
		System.out.println("deposit :" + obj.getName());
		System.out.println("withdraw :" + obj.getBalance());
	}

}
