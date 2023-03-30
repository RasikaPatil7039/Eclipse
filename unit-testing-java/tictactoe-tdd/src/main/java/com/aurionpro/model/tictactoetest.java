package com.aurionpro.model;

import java.util.Scanner;

public class tictactoetest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe Game");
		System.out.println("Enter name of Player 1 :");
		String player1 = sc.nextLine();
		System.out.println("Enter name of Player 2 :");
		String player2 = sc.nextLine();
		Player[] players = { new Player(player1), new Player(player2) };

		Game game = new Game(players);
		ResultAnalyzer analyzer = game.getAnalyzer();
		Board board = analyzer.getBoard();

		printBoard(board);

		while (true) {
			System.out.println("player :" + "(" + game.getCurrentPlayer().getName() + ")");
			System.out.println("enter location number betwen 0-8:");
			int loc = sc.nextInt();
			game.play(loc);
			printBoard(board);
			if (analyzer.getResult() != ResultType.progress) {
				break;
			}

		}

	}

	private static void printBoard(Board board) {
		Cell[] cells = board.getCell();
		for (int i = 0; i < 9; i++) {
			String temp = cells[i].getMark() == MarkType.Empty ? (i + "") : cells[i].getMark().toString();
			System.out.println(temp + " | ");
			if ((i + 1) % 3 == 0) {
				System.out.println("\n------------");
			}
		}
	}
}