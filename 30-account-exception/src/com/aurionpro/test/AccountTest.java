package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientFundsException;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account(1, "rasika", 400);
		//System.out.println(obj);
		
		try {
			obj.withdraw(1000);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
