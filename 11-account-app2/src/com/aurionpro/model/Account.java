package com.aurionpro.model;

public class Account {
	private int accountnumber;
	private String name;
	private double balance;

	public Account(int accountnumber, String name, double balance) {
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountnumber, String name) {
		// this.accountnumber=accountnumber;
		// this.name=name;
		// this.balance=1000;
		this(accountnumber, name, 1000);
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;

	}

	public boolean withdraw(double amount) {
		if (balance - amount >= 1000) {
			balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}
}
