package com.aurionpro.model;

public class Manager extends Employee {

	private double hra;
	private double da;
	private double ta;

	public Manager(int employeeid, String name, double basicsalary) {
		super(employeeid, name, basicsalary);
		hra=0.25*basicsalary;
		da=0.15*basicsalary;
		ta=0.10*basicsalary;

	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra =hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	@Override
	public double calculateAnnualCTC() {
		return getBasicsalary() + hra +da +ta*12 ;
	}

}
