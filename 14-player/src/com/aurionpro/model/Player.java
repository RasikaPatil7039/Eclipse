package com.aurionpro.model;

public class Player {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

	private String country;

	public Player(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static Player eldestPlayer(Player[] players) {
		double max = players[0].getAge(); // highestage
		int i, j, index = 0;
		for (i = 0; i < players.length; i++) {
			if (max <= (players[i].getAge())) {
				max = players[i].getAge();
				index = i;
			}

		}
		return players[index];
	}
}
