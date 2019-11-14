package com.practice.java.CarApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.practice.java.CarApp.controller.Auto;

@Controller
public class MyController {
	
		@Autowired
		MyService serviceApp;
	


	    @GetMapping("/home")
	    public String greetingForm(Model model) {
	        model.addAttribute("vehiculo", new Auto(null, null, null));
	        return "home";
	    }
	    @GetMapping("/login")
	    public String registerForm(Model model) {
	    	model.addAttribute("vehiculo", new Auto(null, null, null));
	    	return "login";
	    }
	    
	    @PostMapping("/home")
	    public String getLogin(@ModelAttribute Auto vehiculo) {
	    	if(serviceApp.getAttribute(vehiculo.getBrand(), vehiculo)) {
	    		
	    		return "result";
	    	}else {
	    		return "wrong";
	    	}
	    	  
	    }
	    
	    @PostMapping("/login")
	    public String setRegister(@ModelAttribute Auto vehiculo) {
	    	serviceApp.setAttribute(vehiculo.getBrand(), vehiculo);
	    	  return "result";  
	    }

	    
	    
	   
	  


}


