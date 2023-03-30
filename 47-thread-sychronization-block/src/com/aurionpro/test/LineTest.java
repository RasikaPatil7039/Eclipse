package com.aurionpro.test;

import com.aurionpro.model.Line;
import com.aurionpro.model.MyThread1;
import com.aurionpro.model.MyThread2;

public class LineTest {

	public static void main(String[] args) {
		Line obj=new Line();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
