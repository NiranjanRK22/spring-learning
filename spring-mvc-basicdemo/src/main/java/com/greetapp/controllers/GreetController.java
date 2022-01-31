package com.greetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
    
	//add a method to handle the request
	
	@RequestMapping("/greet")
	public String greetMessage(Model model)  {
		//call the service layer
		//create the model object 
		model.addAttribute("message", "Have a great day");
		//return the name of jsp page
		return "success";
	}
	
	@RequestMapping("/sayHello")
	public String helloMessage(ModelMap map) {
		map.addAttribute("message", "Hello from hyderabad");
		return "success";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeMessage()  {
		//ModelAndView modelView = new ModelAndView("success", "message", "welcome to mvc");
		//return modelView;
		
		return new ModelAndView("success", "message", "welcome to mvc");
	}
}
