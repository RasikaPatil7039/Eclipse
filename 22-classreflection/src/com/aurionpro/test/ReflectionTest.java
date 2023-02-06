package com.aurionpro.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.aurionpro.model.Reflection;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		Reflection obj = new Reflection();

		Class cls = obj.getClass();
		System.out.println("name of class is : " + cls.getName());
		
		Constructor constructor = cls.getConstructor();
		System.out.println("name of constructor is :" + constructor.getName());
		System.out.println("PUBLIC METHODS OF CLASS ARE:");
		Method[] methods=cls.getMethods();
		for(Method method : methods)
		System.out.println(method.getName());
	}
}
