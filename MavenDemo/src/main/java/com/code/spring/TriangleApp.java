package com.code.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("triangleApp.xml");
		Triangle t=(Triangle)context.getBean("triangle");
		t.draw();
	}

}
