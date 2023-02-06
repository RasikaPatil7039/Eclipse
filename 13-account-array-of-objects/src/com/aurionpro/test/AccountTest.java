package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account accounts[] = { new Account(1, "rasika", 100), new Account(2, "krutika", 600),
				new Account(3, "tejas", 400), new Account(4, "amogh", 200), new Account(5, "rutuja", 500) };

		double max = accounts[0].getBalance(); // highestsalary
		int i, j, index = 0;
		for (i = 0; i < accounts.length; i++) {
			if (max <= (accounts[i].getBalance())) {
				max = accounts[i].getBalance();
				index = i;
			}

		}
		System.out.println("the highest is:" + accounts[index]);
		System.out.println();

		System.out.println("sorting of accounts"); // sorting array
		for (i = 0; i < accounts.length; i++) {
			for (j = i + 1; j < accounts.length; j++) {
				if (accounts[i].getBalance() > accounts[j].getBalance()) {
					Account temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;

				}
			}
		} 

		for (Account x : accounts) { // print account
			System.out.println(x);
		}

	}
}
