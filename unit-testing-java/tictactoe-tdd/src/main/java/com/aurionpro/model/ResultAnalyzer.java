package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer() {
		super();
		this.board = new Board();
		this.result = result;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public ResultType getResult() {
		return result;
	}

	public void setResult(ResultType result) {
		this.result = result;
	}

	private void horizontalWinCheck() {
		Cell[] cells = board.getCell();
		if (cells[0].getMark() == MarkType.x && cells[1].getMark() == MarkType.x && cells[2].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[3].getMark() == MarkType.x && cells[4].getMark() == MarkType.x && cells[5].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[6].getMark() == MarkType.x && cells[7].getMark() == MarkType.x && cells[8].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[0].getMark() == MarkType.o && cells[1].getMark() == MarkType.o && cells[2].getMark() == MarkType.o) {
			result = ResultType.win;
		}

		if (cells[3].getMark() == MarkType.o && cells[4].getMark() == MarkType.o && cells[5].getMark() == MarkType.o) {
			result = ResultType.win;
		}

		if (cells[6].getMark() == MarkType.o && cells[7].getMark() == MarkType.o && cells[8].getMark() == MarkType.o) {
			result = ResultType.win;
		}
	}

	private void verticalWinCheck() {
		Cell[] cells = board.getCell();
		if (cells[0].getMark() == MarkType.x && cells[3].getMark() == MarkType.x && cells[6].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[1].getMark() == MarkType.x && cells[4].getMark() == MarkType.x && cells[7].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[2].getMark() == MarkType.x && cells[5].getMark() == MarkType.x && cells[8].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[0].getMark() == MarkType.o && cells[3].getMark() == MarkType.o && cells[6].getMark() == MarkType.o) {
			result = ResultType.win;
		}

		if (cells[1].getMark() == MarkType.o && cells[4].getMark() == MarkType.o && cells[7].getMark() == MarkType.o) {
			result = ResultType.win;
		}

		if (cells[2].getMark() == MarkType.o && cells[5].getMark() == MarkType.o && cells[8].getMark() == MarkType.o) {
			result = ResultType.win;
		}

	}

	private void diagonalWinCheck() {
		Cell[] cells = board.getCell();
		if (cells[0].getMark() == MarkType.x && cells[4].getMark() == MarkType.x && cells[8].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[2].getMark() == MarkType.x && cells[4].getMark() == MarkType.x && cells[6].getMark() == MarkType.x) {
			result = ResultType.win;
		}

		if (cells[0].getMark() == MarkType.o && cells[4].getMark() == MarkType.o && cells[8].getMark() == MarkType.o) {
			result = ResultType.win;
		}

		if (cells[2].getMark() == MarkType.o && cells[4].getMark() == MarkType.o && cells[6].getMark() == MarkType.o) {
			result = ResultType.win;
		}
	}

	public ResultType analayzeResult() {
		verticalWinCheck();
		horizontalWinCheck();
		diagonalWinCheck();
		if (result != result.win) {
			if (!board.isBoardFull()) {
				result = ResultType.progress;
			} else {
				result = ResultType.draw;
			}

		}

		return result;

	}
}
