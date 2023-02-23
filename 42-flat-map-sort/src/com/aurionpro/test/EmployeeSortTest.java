package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeSortTest {

	public static void main(String[] args) {
		List<Employee> emplist = Arrays.asList(new Employee(1, "rasika", 100000, "java"),
				new Employee(2, "krutika", 2000, "asp.net"), new Employee(3, "rutuja", 20000, "python"));

		//sorted according to salary
		List<Double> collect = emplist.stream().map(n -> n.getSalary()).sorted().collect(Collectors.toList());
		System.out.println(collect);
//sorted dept
		List<String> collect2 = emplist.stream().map(n -> n.getDepartment()).sorted().collect(Collectors.toList());
		System.out.println(collect2);

		List<Employee> collect3 = emplist.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(collect3);

		List<Employee> collect4 = emplist.stream().sorted(Comparator.comparing(Employee::getDepartment))
				.collect(Collectors.toList());
		System.out.println(collect4);
	}
}