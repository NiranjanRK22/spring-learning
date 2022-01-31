package com.shristi.scope;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.scope");
        
		Course course = context.getBean("course", Course.class);
		System.out.println(course.getName());
		System.out.println(course.getTrainer().getName());
		
		Course course1 = (Course) context.getBean("course");
		System.out.println(course1.getName());
		System.out.println(course1.getTrainer().getName());
		
		course.setName("Angular");
		Trainer trainer = course.getTrainer();
		trainer.setName("Rahul");
		
		System.out.println(course.getName());
		System.out.println(course.getTrainer().getName());
		
		System.out.println(course1.getName());
		System.out.println(course1.getTrainer().getName());
		
	}

}
