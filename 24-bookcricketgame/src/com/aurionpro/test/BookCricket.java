package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class BookCricket {
	public static int playerno;
	public static int player1point;
	public static int player1score;
	public static int player2point;
	public static int player2score;

	public static void main(String[] args) {
		System.out.println("WELCOME TO BOOK CRICKET GAME");
		System.out.println("ENTER 1 TO START");
		Scanner sc = new Scanner(System.in);
		playerno = sc.nextInt();

		for (int i = 1; i <= 4; i++) {
			if (playerno == 1) {
				System.out.println("ENTER 1 TO GENERATE BOOK NUMBER");
				int openbook = sc.nextInt();
				Random random = new Random();
				int pageno = random.nextInt(300) + 1;
				player1point = pageno % 7;
				player1score += player1point;
				System.out.println("pageno is: " + pageno);
				System.out.println("Point :" + player1point);
				System.out.println("score: " + player1point);
				System.out.println("total score is: " + player1score);
			}
		}
		System.out.println("===========");
		System.out.println("player2 Enter 2");
		playerno = sc.nextInt();
		for (int i = 1; i <= 4; i++) {
			if (playerno == 2) {
				System.out.println("ENTER 1 TO GENERATE BOOK NUMBER");
				int openbook = sc.nextInt();
				Random random = new Random();
				int pageno = random.nextInt(300) + 1;
				player2point = pageno % 7;
				player2score += player2point;
				System.out.println("pageno is: " + pageno);
				System.out.println(" point :" + player2point);
				System.out.println(" score: " + player2point);
				System.out.println("total score is: " + player2score);
			}
		}

		Winner();
	}

	public static void Winner() {
		if (player1score > player2score) {
			System.out.println("player1 wins!!");
		} else if (player1score == player2score) {
			System.out.println("tiee!!!");
		} else {
			System.out.println("player 2 wins!!");
		}
	}

}
