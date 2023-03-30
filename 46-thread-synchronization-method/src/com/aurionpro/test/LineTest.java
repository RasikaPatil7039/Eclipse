package com.aurionpro.test;

import com.aurionpro.model.Line;
import com.aurionpro.model.Train;

public class LineTest {

	public static void main(String[] args) {
		Line obj=new Line();
		Train t1=new Train(obj);
		Train t2=new Train(obj);
		
		t1.start();
		t2.start();
		
	}

}
