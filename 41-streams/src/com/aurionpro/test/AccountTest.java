package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accountlist = Arrays.asList(new Account(1, "rasika", 10000), new Account(2, "krutika", 20000),
				new Account(3, "asha", 30000), new Account(4, "neha", 1000));
		System.out.println(accountlist);

		List<Account> collect = accountlist.stream().filter(n -> n.getBalance() >= 10000).collect(Collectors.toList());
		System.out.println(collect);
	
	}
}