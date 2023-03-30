package com.aurionpro.test;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("my name is rasika");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		StringTokenizer st1=new StringTokenizer("my,name,is,rasika");
		System.out.println(st1.nextToken(","));
	}

}
