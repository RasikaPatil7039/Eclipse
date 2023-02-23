package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Student;

public class Deserialization {

	public static void main(String[] args) {
		Student obj1 = null;
		try {
			FileInputStream file = new FileInputStream("D:\\\\test.txt"); // read
			ObjectInputStream in = new ObjectInputStream(file);

			obj1 = (Student) in.readObject();
			in.close();
			file.close();
			System.out.println(obj1.id + "     " + obj1.name + "     " + obj1.percentage);
			System.out.println("object deserialized");

		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}
}