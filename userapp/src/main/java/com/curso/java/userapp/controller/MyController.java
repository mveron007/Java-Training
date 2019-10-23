package com.curso.java.userapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MyController {
	
	@GetMapping("/home")
    public String homeForm(Model model) {
        model.addAttribute("user", new User());
        return "home";
    }

    @PostMapping("/home")
    public String getUser(@ModelAttribute User user) {
        return "result";
    }
    
    @DeleteMapping("/result/{name}")
    public String deleteUser(@PathVariable String name)
    {
    
    	System.out.println("Hola Mundo");
     return "result";
    }

    @PutMapping("/result/{name}")
//    public String updateUser(@PathVariable String userId, @RequestBody UserDetailsRequestModel requestUserDetails)
    public String updateUser(@PathVariable String name)
    {
    
    	System.out.println("Hola Mundo");
     
     return "resultput";
    }
	

}
