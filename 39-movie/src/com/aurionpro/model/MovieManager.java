package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	private List<Movie> movies;
	private static final String filepath = "D:\\\\movie.txt ";

	public MovieManager() {
		movies = new ArrayList<>();
		loadMovies();
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		saveMovie();
	}

	public void clearMovies() {

	}

	public List<Movie> getMovies(){
		return movies;
	}

	public void loadMovies() {
		try {
			FileInputStream file = new FileInputStream(filepath); // read
			ObjectInputStream in = new ObjectInputStream(file);

			movies = (List<Movie>)in.readObject();
			//System.out.println("object deseriazlied");
			in.close();
			file.close();
			

		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

	public void saveMovie() {
		try {
			FileOutputStream file = new FileOutputStream(filepath); // towrite
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(movies);
			
			out.close();
			System.out.println("object is serialized");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteAllMovies() {
		movies.clear();
		saveMovie();
		
	}
	public boolean deleteMovie(int id) {
		int index=-1;
		for(int i=0;i<movies.size();i++) {
			if(movies.get(i).getId()==id) {
				index=i;
			}
		}
		if(index!=-1) {
			movies.remove(index);
			return true;
		}
		return false;
		
	}
}
