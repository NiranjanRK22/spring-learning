package com.shristi.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
     private String empName;
     private int empId;
     private Address address;
	public Employee() {
		super();
		System.out.println("In const employee");
		
	}
	public Employee(String empName, int empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	
	@Value("raju")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	@Value("10")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
    @Autowired(required=false)
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", address=" + address + "]";
	}
     
     
}
