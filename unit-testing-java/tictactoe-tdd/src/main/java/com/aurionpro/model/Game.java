package com.aurionpro.model;

public class Game {
	private Player currentPlayer;
	private Player[] players = new Player[2];
	private ResultAnalyzer analyzer;
	private Board board;

	public Game( Player[] players) {
		super();
		this.currentPlayer = players[0];
		this.players = players;
		this.analyzer = new ResultAnalyzer();
		this.board = analyzer.getBoard();
		players[0].setMark(MarkType.x);
		players[1].setMark(MarkType.o);
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(ResultAnalyzer analyzer) {
		this.analyzer = analyzer;
	}

	public void play(int loc)throws InvalidLocationException {
		board.setCellMark(loc, currentPlayer.getMark());
		ResultType result = analyzer.analayzeResult();
		if (result == ResultType.progress) {
			switchPlayer();
		}
		if (result == ResultType.draw) {
			System.out.println(currentPlayer.getName() + "draw");
		}
		if (result == ResultType.win) {
			System.out.println(currentPlayer.getName() + "win");
		}
	}

	private void switchPlayer() {
		if (currentPlayer == players[0]) {
			currentPlayer = players[1];
		} else {
			currentPlayer = players[0];
		}
	}

}
