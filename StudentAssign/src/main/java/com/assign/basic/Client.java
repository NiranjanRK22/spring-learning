package com.assign.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.assign.basic");
        
		Student student = (Student)context.getBean("student");
		System.out.println(student);
	}

}
