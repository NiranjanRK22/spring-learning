package com.formapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formapp.model.Employee;

@Controller
public class EmployeeController {
     
	@RequestMapping("/showform")
	public String showEmpForm()  {
		//model.addAttribute("form", "Employee");
		return "empform";
	}
	
//	@RequestMapping("/addEmployee")
//	public String addEmployee(
//			@RequestParam("empId")int empId,
//			@RequestParam("empName")String name,
//			@RequestParam("city")String city,
//			@RequestParam("salary")double salary,
//			Model model)
//	{
//		Employee employee = new Employee();
//		employee.setEmpName(name);
//		employee.setEmpId(empId);
//		employee.setCity(city);
//		employee.setSalary(salary);
//		model.addAttribute("employee", employee);
//		return "empsuccess";
//	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee,BindingResult result)
	{
		if(result.hasErrors())
			return "empform";
		//System.out.println(employee);
		return "empsuccess";
	}
	
}
