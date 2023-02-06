package com.aurionpro.model;

public class Account {
	private int accountnumber;
	private String name;
	private double balance;

	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
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

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
