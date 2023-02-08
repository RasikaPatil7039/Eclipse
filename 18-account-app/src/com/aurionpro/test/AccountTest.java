package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1, "rasika", 10000);
		System.out.println("saving account : " + sa);
		CurrentAccount ca = new CurrentAccount(1, "rasika", 6000);
		System.out.println("current account :" + ca);
		ca.withdraw(10000);
		
		System.out.println("balance is "+ca.getBalance());

	}

}
