package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {
	StringUtil obj = new StringUtil();

	@Test
	void testtruncateA() {
		assertTrue(obj.truncateAInFirst2Positions("AACD").equals("CD"));
	}

//	@Test
//	void testfirstlast() {
//		assertEquals("true",obj.areFirstAndLatTwoCharactersTheSame("ABCA"));
//	
//	}
}
