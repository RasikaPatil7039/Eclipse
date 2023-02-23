package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class MapTest {

	public static void main(String[] args) {
		List<Integer> numberlist = Arrays.asList(10, 12, 15, 20, 18, 30);

		List<Integer> collect = numberlist.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(collect);

		List<String> players = Arrays.asList("abc", "cgf");
		List<String> collect2 = players.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);

		List<Account> accountlist = Arrays.asList(new Account(1, "rasika", 10000), new Account(2, "krutika", 20000),
				new Account(3, "asha", 30000), new Account(4, "neha", 1000));
		System.out.println(accountlist);

		accountlist = accountlist.stream()
				.map(n -> new Account(n.getAccountnumber(), n.getName(), n.getBalance() * 1.06))
				.collect(Collectors.toList());
		System.out.println(accountlist);

		List<Account> collect3 = accountlist.stream().filter(n -> n.getAccountnumber() == 1)
				.collect(Collectors.toList());
		System.out.println(collect3);

		List<Integer> collect4 = numberlist.stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.collect(Collectors.toList());
		System.out.println(collect4);
	}

}
