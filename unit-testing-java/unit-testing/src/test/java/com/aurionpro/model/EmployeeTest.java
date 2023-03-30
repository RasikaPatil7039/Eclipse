package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee obj=new Employee(1, "rasika", 10000);

	@Test
	void testGetHra() {
		assertEquals(2000.0, obj.getHra());
		//System.out.println(obj.getHra());
	}
	
	@Test
	void testGetTA() {
		assertEquals(1000.0, obj.getTa());
		//System.out.println(obj.getTa());
	}

	@Test
	void testGetDA() {
		assertEquals(1500.0, obj.getDa());
		//System.out.println(obj.getDa());
	}
	
	@Test
	void testCalculateAnnualCTC() {
		assertEquals(25500.0, obj.calculateAnnualCTC());
		//System.out.println(obj.calculateAnnualCTC());
	}
	
	@Test
	void testMonthlyAnnualCTC() {
		assertEquals(10000.0, obj.calculateMonthlySalary());
		//System.out.println(obj.calculateMonthlySalary());
	}
}
