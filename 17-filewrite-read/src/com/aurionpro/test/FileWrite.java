package com.aurionpro.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter obj = new FileWriter("D:\\hello.txt");  //to create a file  //FileWriter is inbuild method
			obj.write("hello how are you");  //to write in file
			obj.close();
		} catch (IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}

	}

}
