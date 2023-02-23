package com.aurionpro.test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.*;
import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		HashSet<Account> set = new HashSet<>();  //by having hashset duplicate values will not be printed

		Account obj = new Account(1, "rasika", 1000);
		Account obj1 = new Account(2, "rutuja", 3000);
		Account obj2 = new Account(3, "krutika", 2000);

		set.add(obj);
		set.add(obj1);
		set.add(obj2);
		set.add(new Account(4, "abc", 8000));
		set.add(new Account(4, "abc", 4877));

		System.out.println(set);
//		System.out.println("original hashset:");
//		System.out.println(set);
//
//		System.out.println("after soreted");
//		
//		List<Account>list=new Arraylist<Account>(set);
//		double totalbalance = 0;
//		for (Account x : list) {
//			System.out.println(x);
//			totalbalance += x.getBalance();
//		}
//		System.out.println("totalbalance is: " + totalbalance);
//
//		double max = list.get(0).getBalance();
//		for (int i = 1; i < list.size(); i++) {
//			if (max < list.get(i).getBalance())
//				max = list.get(i).getBalance();
//		}
//		System.out.println("maximum balance is :" + max);
//
//		double min = list.get(0).getBalance();
//		for (int i = 1; i < list.size(); i++) {
//			if (min > list.get(i).getBalance())
//				min = list.get(i).getBalance();
//		}
//		System.out.println("minimum balance is :" + min);
//
	}

}
