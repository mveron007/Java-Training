package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dominio.Animal;
import repository.AnimalRepository;



@RestController
public class AnimalController {
	@Autowired
    AnimalRepository animalRepository;
	
	 @GetMapping("/animales")
	    public List<Animal> getAllAnimales() {
	        return animalRepository.findAll();
	    }
	 
	 @PostMapping("/animales/add")
	 public Animal create(@RequestBody Animal body) {
		 return animalRepository.save(body);
	 }
	 
	 @PutMapping("/animales")
	 public Animal update(@RequestBody Animal body) {
		 return animalRepository.save(body);
	 }
}
