package com.aurionpro.model;

public class SavingAccount extends Account {

	public SavingAccount(int accountnumber, String name, double balance) {
		super(accountnumber, name, balance);

	}
		@Override
		public void withdraw(double amount) {
			if (getBalance() - amount >= 1000) {
				setBalance(getBalance() - amount);
			}
	}

}
