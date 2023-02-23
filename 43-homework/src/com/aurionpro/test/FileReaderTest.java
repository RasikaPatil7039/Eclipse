package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		String filename = "D:\\test1.txt";
		
		//read file using filereader
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		System.out.println("-----------");
		//read file using stream
		Path path=Paths.get(filename);
		Stream<String> stream;
		stream=Files.lines(path);
		stream.forEach(System.out::println);

	}
	

}
