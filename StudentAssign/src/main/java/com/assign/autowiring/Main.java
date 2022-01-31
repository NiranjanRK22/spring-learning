package com.assign.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.assign.autowiring");
		
		League league = (League) context.getBean("league");
		league.printLeague("cricket");

	}

}
