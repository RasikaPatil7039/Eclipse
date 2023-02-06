package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account( "s","rasika", 200);
		Account obj1 = new Account( "s","krutika", 400);
		Account obj2 = new Account( "s","siya", 00);
		int con = Account.getcountCount();
		System.out.println(con);
	}

}
