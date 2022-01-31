package com.shristi.basic;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		/*
		 * Employee employee = new Employee(); employee.setEmpId(1);
		 * System.out.println(employee.getEmpId()); employee.setEmpName("ram");
		 * System.out.println(employee.getEmpName()); Address address = new
		 * Address("Telangana", "city", 50004); employee.setAddress(address);
		 * //System.out.println(employee.getAddress()); System.out.println(employee);
		 */
        
        ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.basic");
        Employee employee = (Employee)context.getBean("employee"); //bean name
        System.out.println(employee);
        
        Employee employee1 = context.getBean("employee",Employee.class); //bean name and class type
        System.out.println(employee1);
        
        Employee employee2 = context.getBean(Employee.class); //bean name and class type
        System.out.println(employee2);
        
        String[] beans = context.getBeanDefinitionNames();
        Stream<String> stream1 = Arrays.stream(beans);
        stream1.forEach(System.out::println); 
	}

}
