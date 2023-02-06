package com.aurionpro.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws Exception {  //to read file
		File file = new File("D:\\\\hello.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			;
		}
		sc.close();
	}
}
