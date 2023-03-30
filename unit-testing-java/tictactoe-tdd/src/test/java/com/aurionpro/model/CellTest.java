package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CellTest {
	Cell cell;

	@BeforeEach
	void init() {
		cell = new Cell();
	}

	@Test
	void testGetMark_checkIsEmpty() {
		assertEquals(MarkType.Empty, cell.getMark());
	}
	
	void testSetMark_setXOCell()  {
		cell.setMark(MarkType.x);
		assertEquals(MarkType.x, cell.getMark());
	}
	
	void testSetMark_CellAlreadyMarkedException()  {
		cell.setMark(MarkType.Empty);
		assertThrows(CellAlreadyMarkedException.class, ()->cell.setMark(MarkType.x));
	}

}
