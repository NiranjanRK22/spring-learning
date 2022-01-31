package com.shristi.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.constr");
        Mobile mobile = (Mobile) context.getBean("mobile");
        System.out.println(mobile);
        
        Mobile mobile1 = context.getBean(Mobile.class);
        System.out.println(mobile1);
        
	}

}
