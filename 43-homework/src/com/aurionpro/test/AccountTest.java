package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> account = Arrays.asList(new Account(1, "rasika", 1000), new Account(2, "krutika", 3000),
				new Account(3, "abc", 500));

		Account min = account.stream().min(Comparator.comparing(Account::getSalary)).get();
		System.out.println(min);

		Account max = account.stream().max(Comparator.comparing(Account::getSalary)).get();
		System.out.println(max);

		List<String> collect = account.stream().map(n -> n.getName()).filter(n -> n.length() >= 6)
				.collect(Collectors.toList());
		System.out.println(collect);

		Double collect2 = account.stream().collect(Collectors.summingDouble(Account::getSalary));
		System.out.println(collect2);
	}

}
