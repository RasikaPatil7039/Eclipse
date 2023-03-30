package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {
	ResultAnalyzer resultanalyzer;
	Board board;
	Cell[] cells;

	@BeforeEach
	void init() {
		resultanalyzer = new ResultAnalyzer();
		board = resultanalyzer.getBoard();
		cells = board.getCell();
	}

	@Test
	void testHorizontalWinCheck() {
		cells[0].setMark(MarkType.x);
		cells[1].setMark(MarkType.x);
		cells[2].setMark(MarkType.x);
		assertEquals(ResultType.win, resultanalyzer.analayzeResult());

	}

	@Test
	void testVerticalWinCheck() {
		cells[0].setMark(MarkType.x);
		cells[3].setMark(MarkType.x);
		cells[6].setMark(MarkType.x);
		assertEquals(ResultType.win, resultanalyzer.analayzeResult());
	}

	@Test
	void testDiagnolWinCheck() {
		cells[0].setMark(MarkType.x);
		cells[4].setMark(MarkType.x);
		cells[8].setMark(MarkType.x);
		assertEquals(ResultType.win, resultanalyzer.analayzeResult());
	}

	@Test
	void testDrawCheck() {
		cells[0].setMark(MarkType.x);
		cells[1].setMark(MarkType.o);
		cells[2].setMark(MarkType.x);

		cells[3].setMark(MarkType.x);
		cells[4].setMark(MarkType.x);
		cells[5].setMark(MarkType.o);

		cells[6].setMark(MarkType.o);
		cells[7].setMark(MarkType.x);
		cells[8].setMark(MarkType.o);
		assertEquals(ResultType.draw, resultanalyzer.analayzeResult());
	}

	@Test
	void testProgressCheck() {
		// cells[0].setMark(MarkType.x);
		cells[1].setMark(MarkType.o);
		cells[2].setMark(MarkType.x);

		cells[3].setMark(MarkType.x);
		cells[4].setMark(MarkType.x);
		cells[5].setMark(MarkType.o);

		cells[6].setMark(MarkType.o);
		cells[7].setMark(MarkType.x);
		cells[8].setMark(MarkType.o);
		assertEquals(ResultType.progress, resultanalyzer.analayzeResult());
	}
}
