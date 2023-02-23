package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();

		Account obj = new Account(1, "rasika", 1000);
		Account obj1 = new Account(2, "rutuja", 3000);
		Account obj2 = new Account(3, "krutika", 2000);

		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		list.add(new Account(4,"abc",800));

		double totalbalance = 0;
		for (Account x : list) {
			System.out.println(x);
			totalbalance += x.getBalance();
		}
		System.out.println("totalbalance is: " + totalbalance);

		double max = list.get(0).getBalance(); 
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i).getBalance())
				max = list.get(i).getBalance();
		}
		System.out.println("maximum balance is :" + max);
		
		double min=list.get(0).getBalance();
		for (int i = 1; i < list.size(); i++) {
			if (min > list.get(i).getBalance())
				min = list.get(i).getBalance();
		}
		System.out.println("minimum balance is :" + min);
		
		System.out.println("sort according balance:");
		Collections.sort(list,Collections.reverseOrder());  //descending order according to balance
		System.out.println(list);
		
		System.out.println("sort according to name:");
		Collections.sort(list);    //descending order according to name
		System.out.println(list);
		
		
		
	}

}
