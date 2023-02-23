package com.aurionpro.model;

public class BMI {
	private Person person;
	private double bmi;

	public BMI(Person person) {
		super();
		this.person = person;
		this.bmi = calculateBMI();
	}

	public double calculateBMI() {
		return person.getWeight() / (person.getHeight() * person.getHeight());

	}

	public String getBodyType() {
		if (bmi < 18.5) {
			System.out.println("underweight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("healthyweight");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("overweight");
		} else
			System.out.println("obese");
		return null;

	}

	public double getBmi() {
		return bmi;
	}

	

}
