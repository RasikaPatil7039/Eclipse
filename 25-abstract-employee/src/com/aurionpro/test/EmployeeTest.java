package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Salesman;

public class EmployeeTest {

	public static void main(String[] args) {

		Manager obj = new Manager(1, "rasika", 10000);
		printSalaryDetails(obj);
		System.out.println("------------");
		Salesman obj1 = new Salesman(2, "krutika", 9000);
		printSalaryDetails(obj1);
		System.out.println("------------");
		Accountant obj2 = new Accountant(3, "rutuja", 8000);
		printSalaryDetails(obj2);
	}

	private static void printSalaryDetails(Manager obj) {
		System.out.println("emplyoee id :" + obj.getEmployeeid());
		System.out.println("employee name :" + obj.getName());
		System.out.println("employee basic salary :"+obj.getBasicsalary());
		System.out.println("annual ctc is :" + obj.calculateAnnualCTC());

	}

	private static void printSalaryDetails(Salesman obj1) {
		System.out.println("emplyoee id :" + obj1.getEmployeeid());
		System.out.println("employee name :" + obj1.getName());
		System.out.println("employee basic salary :"+obj1.getBasicsalary());
		System.out.println("annual ctc is :" + obj1.calculateAnnualCTC());

	}

	private static void printSalaryDetails(Accountant obj2) {
		System.out.println("emplyoee id :" + obj2.getEmployeeid());
		System.out.println("employee name :" + obj2.getName());
		System.out.println("employee basic salary :"+obj2.getBasicsalary());
		System.out.println("annual ctc is :" + obj2.calculateAnnualCTC());

	}
}
