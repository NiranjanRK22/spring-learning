package com.shristi.autojavabased;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
    public static void main(String[] args)  {
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.autojavabased");
//    	ShapeFactory factory = context.getBean("shapeFactory", ShapeFactory.class);
//    	factory.printShape(10, 20);
    	
//    	Shape shape = context.getBean("rectangle", Rectangle.class);
//    	shape.calcArea(10, 20);
    	
    	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        
    	ShapeFactory factory = context.getBean(ShapeFactory.class);
        factory.printShape("square", 10, 20);
    }
    
}
