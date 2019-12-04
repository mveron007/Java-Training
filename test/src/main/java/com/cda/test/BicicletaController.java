package com.cda.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cda.test.dominio.Bicicleta;
import com.cda.test.repository.BicicleteriaRepository;


@RestController
public class BicicletaController {
	
	@Autowired 
	BicicleteriaRepository repo;
	
	@GetMapping("/bicicleta5")
	public List<Bicicleta> getBikes() {
		return repo.findAll();
	}
	
	@RequestMapping (value="/bicicletas", method=RequestMethod.GET)
	public List<Bicicleta> getAllBikes(){
		return repo.findAll();
	}
	
	@PostMapping("/biciclets/add")
	public Bicicleta loadBikes(@RequestBody Bicicleta body){
		return repo.save(body);
		
	}
	
	@RequestMapping(value="/biciclet5/ad5", method=RequestMethod.POST)
	public Bicicleta create(@RequestBody Bicicleta body) {
		return repo.save(body);
	}
	
	
	@PutMapping("/biciclets/")
	public Bicicleta updateBikes(@RequestBody Bicicleta body) {
		return repo.save(body);
	}
	
	@RequestMapping(value="/biciclet5/", method=RequestMethod.PUT)
	public Bicicleta update(@RequestBody Bicicleta body) {
		return repo.save(body);
	}
	
	
	@DeleteMapping("/biciclets/{id}")
	public Bicicleta deleteBike(@PathVariable("id") Long id) {
		Optional<Bicicleta> bike=repo.findById(id);
		
		if(bike.isPresent()) {
			repo.delete(bike.get());
			return bike.get();
		}else {
			return null;
		}
	}

}
