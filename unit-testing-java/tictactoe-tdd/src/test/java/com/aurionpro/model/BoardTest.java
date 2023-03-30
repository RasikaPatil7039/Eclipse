package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	Board board;
	Cell[] cells;

	@BeforeEach
	void init() {
		board = new Board();
		cells = board.getCell();
	}

	@Test
	void testIsBoardFull_checkIsEmpty() {
		boolean flag = true;
		for (Cell x : cells) {
			if (x.getMark() != MarkType.Empty) {
				flag = false;
				break;
			}
		}
		assertTrue(flag);
	}

	@Test
	void testSetCellMark_markAtParticularLocation() throws InvalidLocationException {
		board.setCellMark(1, MarkType.x);
		assertEquals(MarkType.x, cells[1].getMark());

	}

	@Test
	void testSetCellMark_InvalidExceptionCheck() {

		assertThrows(InvalidLocationException.class, () -> board.setCellMark(9, MarkType.x));
	}

	@Test
	void testIsBoardFull() throws InvalidLocationException {
		for (int i = 0; i < 8; i++) {
			board.setCellMark(i, MarkType.x);
		}
		assertEquals(true, board.isBoardFull());

	}

	@Test
	void testSetCellMark_CellAlreadyMarkedException() throws InvalidLocationException {
		board.setCellMark(1, MarkType.x);
		assertThrows(CellAlreadyMarkedException.class, () -> board.setCellMark(1,MarkType.x));
	}
}