package com.aurionpro.model;

public abstract class Employee {
	private int employeeid;
	private String name;
	private double basicsalary;

	public Employee(int employeeid, String name, double basicsalary) {
		this.employeeid = employeeid;
		this.name = name;
		this.basicsalary = basicsalary;

	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public abstract double calculateAnnualCTC();
}
