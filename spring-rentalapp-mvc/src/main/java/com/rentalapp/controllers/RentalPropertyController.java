package com.rentalapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentalapp.model.RentalProperty;
import com.rentalapp.service.IRentalPropertyService;

@Controller
public class RentalPropertyController {
	
	private IRentalPropertyService rentalPropertyService;
	
	@Autowired
	public void setRentalPropertyService(IRentalPropertyService rentalPropertyService) {
		this.rentalPropertyService = rentalPropertyService;
	}
    
	@RequestMapping("/")
	public String home(Model model) {
		List<RentalProperty> propertyList = rentalPropertyService.getAll();
		model.addAttribute("propertyList",propertyList);
		return "home";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("category")String category, Model model)  {
		List<RentalProperty> propertyList = rentalPropertyService.getByCategory(category);
		model.addAttribute("propertyList",propertyList);
		return "home";
	}
	
	@RequestMapping("/admin")
	public String admin()  {
	    return "admin";	
	}
	
	@RequestMapping("/addForm") //url name
    public String showAddForm()  {
    	return "addform"; //jsp page name
    }
	
	@RequestMapping("/addProperty")
	public String addProperty(RentalProperty rentalProperty, BindingResult result) {
		if (result.hasErrors())
			return "addform";
		rentalPropertyService.addRentalProperty(rentalProperty);
        return "admin";		
	}
	
	@RequestMapping("/home")
	public String home()  {
		return "redirect:/";   //redirect to url not jsp page
	}
	@RequestMapping("/editForm") //url name
    public String showEditForm()  {
    	return "editform"; //jsp page name
    }
	
	@RequestMapping("/editProperty")
	public String editProperty(@RequestParam("propertyId") int propertyId, Model model) {
		RentalProperty property = rentalPropertyService.getById(propertyId);
		model.addAttribute("rentalProperty", property);
		return "updateform";
	}
	
	@RequestMapping("/updateProperty")
	public String updateProperty(@RequestParam("propertyId") int propertyId,
			@RequestParam("rentExpected") double rentExpected) {
	 rentalPropertyService.updateRentalProperty(propertyId, rentExpected);
		
		return "admin";
	}
	@RequestMapping("/deleteForm") //url name
    public String showDeleteForm()  {
    	return "deleteform"; //jsp page name
    }
	@RequestMapping("/deleteProperty")
	public String deleteProperty(@RequestParam("propertyId") int propertyId) {
		rentalPropertyService.deleteRentalProperty(propertyId);
		return "admin";
	}	
}
