package com.aurionpro.model;

public class Salesman extends Employee {

	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Salesman(int employeeid, String name, double basicsalary) {
		super(employeeid, name, basicsalary);
		bonus = 0.30 * basicsalary;
	}

	@Override
	public double calculateAnnualCTC() {
		return getBasicsalary() +  bonus *12;
	}

}
