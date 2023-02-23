package com.aurionpro.model;

public class InsufficientFundsException extends RuntimeException {

	Account account;
	double amount;

	public InsufficientFundsException(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		
		return this.getClass() + " " + "cannot withdraw amount" + "  " + amount + " ...." + "accountno is:"
				+ account.getAccountnumber() + "... " + "balance is: " + " " + account.getBalance();
	}

}
