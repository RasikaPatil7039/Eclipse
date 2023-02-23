package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(101, "rasika", Arrays.asList("cooking", "baking")),
				new Student(102, "krutika", Arrays.asList("dance")),
				new Student(103, "rutuja", Arrays.asList("eating", "cooking")));

		//using map to find name of each student
		List<String> collect = students.stream().map(n->n.getName()).distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = students.stream().flatMap(list->list.getHobbies().stream()).distinct().collect(Collectors.toList());
		System.out.println(collect2);

		List<String> collect3 = students.stream().flatMap(list->list.getHobbies().stream()).filter(n->n.endsWith("ing")).distinct().collect(Collectors.toList());
		System.out.println(collect3);
	
	
	}

}
