package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player players[] = { 
				new Player("rasika", 40, "india"), new Player("krutika", 25, "india"),
				new Player("riya", 15, "india") };


		for (Player x : players) {
			System.out.println(x);
		}
		Player eldestPlayer = Player.eldestPlayer(players);
		printPlayerDetails(eldestPlayer);
	}

	private static void printPlayerDetails(Player obj) {
		System.out.println("player name :" + obj.getName());
		System.out.println("player age :" + obj.getAge());
		System.out.println("player country :" + obj.getCountry());

	}

}
