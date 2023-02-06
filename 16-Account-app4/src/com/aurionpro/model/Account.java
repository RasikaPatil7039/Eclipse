package com.aurionpro.model;

public class Account {
	private int accountnumber;
	private String name;
	private int balance;
	private static int count;

	public Account(int accountnumber, String name, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		count++;
	}

	public Account(int accountnumber, String name) {
		this(accountnumber, name, 1000);
	}

	public Account(int accountnumber) {
		this(accountnumber,"unknow", 1000);
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static int getcountCount() {
		return count;

	}
}
