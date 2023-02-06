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

	public Account(int accountnumber, String name) {
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

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdraw(double amount) {
		
	}
}
