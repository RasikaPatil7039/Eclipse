package com.aurionpro.model;

public class Accountant extends Employee {

	private double performanceAllownce;

	public double getPerformanceAllownce() {
		return performanceAllownce;
	}

	public void setPerformanceAllownce(double performanceAllownce) {
		this.performanceAllownce = performanceAllownce;

	}

	public Accountant(int employeeid, String name, double basicsalary) {
		super(employeeid, name, basicsalary);
		performanceAllownce = 0.15 * basicsalary;

	}

	@Override
	public double calculateAnnualCTC() {
		return getBasicsalary() + performanceAllownce *12;
	}

}
