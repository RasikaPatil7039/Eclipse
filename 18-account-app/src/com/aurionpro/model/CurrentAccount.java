package com.aurionpro.model;

public class CurrentAccount extends Account {
	private int over_draft_limit=-20000;

	public CurrentAccount(int accountnumber, String name, double balance) {
		super(accountnumber, name, balance);
	}
		
		
		@Override
		public void withdraw(double amount) {
			if (getBalance() - amount > over_draft_limit) {
				System.out.println("over draft");
			}
	}

	
}
