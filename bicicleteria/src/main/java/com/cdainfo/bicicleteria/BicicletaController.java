package com.cdainfo.bicicleteria;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdainfo.bicicleteria.dominio.Bicicleta;
import com.cdainfo.bicicleteria.repository.BicicletaRepository;

@RestController
public class BicicletaController {
	@Autowired
	BicicletaRepository repository;
	
	
	@RequestMapping(value="/bicicletas", method = RequestMethod.GET)
	public ResponseEntity<List<Bicicleta>> getAllBicicletas() {
        List<Bicicleta> bikes;
        try {
            bikes = repository.findAll();
        } catch (Exception ex) {
            return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(bikes, HttpStatus.OK);
    }
	
	
	
//	public List<Bicicleta> getAllBicicletas() {
//		return repository.findAll();
//    }
	
	@RequestMapping(value="/bicicleta/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Bicicleta>> getAllByID(@PathVariable("id") Long id) {
        Optional<Bicicleta> bikesId;
        try {
            bikesId = repository.findById(id);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bikesId, HttpStatus.OK);
    }
	
	@RequestMapping(value="/bicicleta/search/{brand}", method = RequestMethod.GET)
	public List<Bicicleta> listBrands(@PathVariable("brand") String brand) {
		return repository.findByBrand(brand);
	}
	
	@RequestMapping(value="/bicicleta/add", method= RequestMethod.POST)
	public Bicicleta create(@RequestBody Bicicleta body) {
		return repository.save(body);
	}
	
	
	@RequestMapping(value="/bicicleta/", method= RequestMethod.PUT)
	public Bicicleta update(@RequestBody Bicicleta body) {
		return repository.save(body);
	}
	
	
	
	@RequestMapping(value="/bicicleta/delete/{id}", method = RequestMethod.DELETE)
	public Bicicleta deleteBikes(@PathVariable("id") Long id) {
		Optional<Bicicleta> bi = repository.findById(id);
        if ( bi.isPresent() ) {
            repository.delete(bi.get());
            return bi.get();
        } else {
            return null;
        }
	}
	
}	
