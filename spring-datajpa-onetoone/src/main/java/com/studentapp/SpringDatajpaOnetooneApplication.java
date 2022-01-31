package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}
    
	@Autowired
	private IStudentService studentService;

	@Override
	public void run(String... args) throws Exception {
	     Address address = new Address("hyderabad", "telangana");
	     Student student = new Student("niranjan", "ECE", address);
	     //studentService.addStudent(student);
	     
	     //Student nstudent = studentService.getById(2);
	     //Address address1 = nstudent.getAddress();
	    // address1.setCity("khammam");
	     //studentService.updateStudent(nstudent);
	     studentService.getAll().forEach(System.out::println);
	     
	     studentService.getByCity("hyderabad").forEach(System.out::println);
	     System.out.println();
	     studentService.getByDeptAndCity("ECE", "hyderabad").forEach(System.out::println);
	     System.out.println();
	     studentService.getByState("telangana");
	}
	

}
