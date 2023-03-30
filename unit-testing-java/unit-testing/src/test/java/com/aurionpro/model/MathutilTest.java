package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

	@TestInstance(Lifecycle.PER_CLASS)
class MathutilTest {
	Mathutil obj = new Mathutil();

	@BeforeAll
	void beforeAll() {
		System.out.println("before all");

	}

	@Test
	void testAddition() {
		// assertEquals(40, obj.addition(10, 20));
		assertTrue(obj.addition(10, 20) == 30);
	}

	@Test
	void testDivision() {
		assertTrue(obj.div(4, 2) == 2);
	}

	@Test
	void testDivision_ArithmeticException() {
		assertThrows(ArithmeticException.class, () -> obj.div(4, 0));
	}

	@Test
	void testSortArray() {
		int[] arr = { 7, 9, 1, 4 };
		int[] expected = { 1, 4, 7, 9 };
		assertArrayEquals(expected, obj.sortArray(arr));
	}
}
