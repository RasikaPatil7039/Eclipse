package com.aurionpro.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieController {

	private MovieManager manager;

	public MovieController() {
		super();
		this.manager = new MovieManager();
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		int choice = 1;
		System.out.println("welcome");
		while (choice != 4) {
			System.out.println("enter 1 to add movies");
			System.out.println("enter 2 to display movies");
			System.out.println("enter 3 to delete movies");
			System.out.println("enter 4 to delete movies by id");
			System.out.println("enter 5 to exit");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Movie movie = setMovieDetails();
				manager.addMovie(movie);
				break;
			case 2:
				List<Movie> movies = manager.getMovies();
				System.out.println(movies);
				break;
			case 3:
				manager.deleteAllMovies();
				System.out.println("all movies deleted");
				break;
			case 4:
				System.out.println("enter id:");
				int id = sc.nextInt();
				if (manager.deleteMovie(id)) {
					System.out.println("movie deleted");
				} else {
					System.out.println("id not found");
				}
				break;
			case 5:
				System.out.println("program ended");
				break;
			default:
				System.out.println("invalid choice");
			}

		}
	}

	private Movie setMovieDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter movie id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter movie name");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("enter movie year");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("enter movie genre");
		String genre = sc.nextLine();

		return new Movie(id, name, year, genre);
	}
}
