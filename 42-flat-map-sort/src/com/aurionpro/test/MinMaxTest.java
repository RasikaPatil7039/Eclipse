package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class MinMaxTest {

	public static void main(String[] args) {
		List<Employee> emplist = Arrays.asList(new Employee(1, "rasika", 100000, "java"),
				new Employee(2, "krutika", 2000, "asp.net"), new Employee(3, "rutuja", 20000, "python"));

		emplist.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		emplist.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

		Optional<Employee> max = emplist.stream().max(Comparator.comparing(Employee::getDepartment));
		if (max.isPresent()) {
			System.out.println(max.get());
		}

		Optional<Employee> findAny = emplist.stream().findAny();
		if (findAny.isPresent()) {
			System.out.println(findAny.get());
		}

		Optional<Employee> findFirst = emplist.stream().findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}

		List<Integer> emplist1 = Arrays.asList(1, 2, 3, 4);
		System.out.println(emplist1.stream().reduce(0, (Integer::sum)));
		System.out.println(emplist1.stream().reduce(0, (total, e) -> Integer.sum(total, e)));
	}
}
//reduce,findany,findfirst
