package com.curso.java.appIngresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.java.appIngresos.controller.Ingreso;

@Controller
public class MyController {
	
		@Autowired
		MyService serviceApp;
	


	    @GetMapping("/home")
	    public String greetingForm(Model model) {
	        model.addAttribute("ingreso", new Ingreso());
	        return "home";
	    }
	    @GetMapping("/login")
	    public String registerForm(Model model) {
	    	model.addAttribute("ingreso", new Ingreso());
	    	return "login";
	    }

	    @PostMapping("/home")
	    public String getLogin(@ModelAttribute Ingreso ingreso) {
	    	if(serviceApp.getAttribute(ingreso.getName(), ingreso.getPassword())) {
	    		
	    		return "result";
	    	}else {
	    		return "wrong";
	    	}
	    	  
	    }
	    @PostMapping("/login")
	    public String setRegister(@ModelAttribute Ingreso ingreso) {
	    	serviceApp.setAttribute(ingreso.getName(), ingreso.getPassword());
	    	  return "result";  
	    }
	    
	    
	   
	  


}
