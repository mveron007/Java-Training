package com.curso.java.loginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


public class MyController {
	
	@Autowired
	DummyService serviceApp;
	
	@GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping("/login")
    public String getLogin(@ModelAttribute Login login) {
    	if(serviceApp.getAttribute(login.getName(), login.getPassword())) {
    		return "result";
    	}else {
    		return "error";
    	}
    	  
    }
}
