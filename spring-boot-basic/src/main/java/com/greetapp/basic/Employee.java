package com.greetapp.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private String department;
    @Autowired
    private Address address;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String department, Address address) {
		super();
		this.name = name;
		this.department = department;
		this.address = address;
	}

	public String getName() {
		return name;
	}
    
	@Value("Niranjan")
	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}
    
	@Value("ECE")
	public void setDepartment(String department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", address=" + address + "]";
	}
	
}
