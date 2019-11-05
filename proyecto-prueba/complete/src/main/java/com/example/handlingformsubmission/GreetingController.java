package com.example.handlingformsubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Persona;
import com.example.repo.IPersonaRepo;

@Controller
public class GreetingController {
	
	@Autowired
	private IPersonaRepo repo;
	
    @GetMapping("/greeting")
    public String greetingForm(@RequestParam(name="name", required=false, defaultValue="World")) {
//        model.addAttribute("greeting", new Greeting());
    	Persona p=new Persona();
    	p.setIdPersona(1);
    	p.setName("Pepe");
    	
    	model.addAttribute("name", name);
    	repo.save(p);
        return "greeting";
    }



}
