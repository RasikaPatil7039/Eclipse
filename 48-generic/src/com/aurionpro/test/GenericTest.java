package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest<T> {

	T obj;

	public GenericTest(T obj) {
		super();
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}

	public static void main(String[] args) {
		GenericTest<Integer> obj1 = new GenericTest<Integer>(10);
		System.out.println(obj1.getObject());

		GenericTest<String> obj2 = new GenericTest<String>("rasika");
		System.out.println(obj2.getObject());

	}
}
