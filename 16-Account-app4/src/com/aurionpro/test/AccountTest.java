package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account(1, "rasika", 200);
		Account obj1 = new Account(2, "krutika", 400);
		Account obj2 = new Account(3, "siya", 00);
		int con = Account.getcountCount();
		System.out.println(con);
	}

}
