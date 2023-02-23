package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Student;

public class Serialization {

	public static void main(String[] args) {
		try {
			Student obj = new Student(1, "Rasika", 80.0);

			FileOutputStream fout = new FileOutputStream("D:\\test.txt"); // towrite
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(obj);
			out.flush();
			out.close();
			System.out.println("object is serialized");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
