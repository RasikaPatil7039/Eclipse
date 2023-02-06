package com.aurionpro.model;

public class Account {
	private String accountnumber;
	private String name;
	private int balance;
	private static int count;

	public Account(String accountnumber, String name, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		count++;
	}

	public Account(String accountnumber, String name) {
		this("s", name, 1000);
	}

	public Account(String accountnumber) {
		this("s","unknow", 1000);
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
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
