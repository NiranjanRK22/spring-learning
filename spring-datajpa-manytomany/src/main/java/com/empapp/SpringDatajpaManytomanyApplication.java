package com.empapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.model.Course;
import com.empapp.model.Employee;
import com.empapp.service.ICourseService;
import com.empapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}
    
	
	private ICourseService courseService;
	
	private IEmployeeService employeeService;
	
	
	
	/**
	 * @param courseService the courseService to set
	 */
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}

	@Autowired
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	@Override
	public void run(String... args) throws Exception {
		
//		Course course1 = new Course("html", "2 weeks", 3000);
//		courseService.addCourse(course1);
//		Course course2 = new Course("css", "2 weeks", 2000);
//		courseService.addCourse(course2);
//		Course course3 = new Course("javascript", "4 weeks", 5000);
//		courseService.addCourse(course3);
//		Set<Course> courseSet = new HashSet<>(Arrays.asList(course1, course2, course3));
//		Employee employee = new Employee("sam", "hyderabad");
//		employee.setCourseList(courseSet);
		//Employee emp = employeeService.addEmployee(employee);
		//System.out.println(emp);
		
//		courseSet = new HashSet<>(Arrays.asList(course1, course3));
//		employee =  new Employee("priya", "chennai");
//		employee.setCourseList(courseSet);
		//emp = employeeService.addEmployee(employee);
		//System.out.println(emp);
		
		employeeService.getAll().forEach(System.out::println);
		System.out.println();
		
		employeeService.getByCity("chennai").forEach(System.out::println);
		System.out.println();
		
		employeeService.getByCourseName("java").forEach(System.out::println);
		System.out.println();
		
		System.out.println(employeeService.getById(2));
		System.out.println();
		
//		Employee nemployee = employeeService.getById(5);
//		Set<Course> courseList = nemployee.getCourseList();
//		//adding a course to existing List
//		courseList.add(courseService.getById(2));
//		nemployee.setCourseList(courseList);
//		nemployee.setCity("warangal");
//		employeeService.updateEmployee(nemployee);
		
		//Employee emp1 = new Employee("kiran", "hyderabad");
		
		
		courseService.getAll().forEach(System.out::println);
		
		System.out.println(courseService.getById(9));
		
		courseService.getByEmployee("niranjan").forEach(System.out::println);
		
		courseService.getByLesserFees(3000).forEach(System.out::println);
		
		courseService.getByCity("chennai").forEach(System.out::println);
		
		
		//courseService.deleteCourse(14);
	}

}
