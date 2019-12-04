package com.cdainfo.afip;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdainfo.afip.dominio.Impuesto;
import com.cdainfo.afip.dominio.Usuario;
import com.cdainfo.afip.repository.ImpuestoRepository;
import com.cdainfo.afip.repository.UsuarioRepository;

@RestController
public class AfipController {
	@Autowired
	ImpuestoRepository impRepo;
	UsuarioRepository usuarioRepo;
	
	@RequestMapping(value="/usuario/{claveFiscal}", method=RequestMethod.GET)
	public Optional<Usuario> getUsuarioClave(@PathVariable("claveFiscal") Long claveFiscal){
		return usuarioRepo.findByClaveFiscal(claveFiscal);
	}
	
	@RequestMapping(value="/impuestos", method=RequestMethod.GET)
	public List<Impuesto> getUsuarios(){
		return impRepo.findAll();
	}
	
	@RequestMapping(value="/buscar/impuesto/{tipo}", method=RequestMethod.GET)
	public Optional<Impuesto> getUsuarioClave(@PathVariable("tipo") String tipo){
		return impRepo.findByTipo(tipo);
	}
	
	@RequestMapping(value="/impuesto/{tipo}/buscar/{fechaLiquidacion}", method=RequestMethod.PUT)
	public Impuesto update(@PathVariable("tipo") String tipo,
			@PathVariable("fechaLiquidacion") Date fechaLiquidacion,
			@RequestBody Impuesto body) {
		body.setFechaLiquidacion(fechaLiquidacion);
		return impRepo.save(body);
	}
	
	
	@RequestMapping(value="/impuesto/buscar/{fechaLiquidacion}", method=RequestMethod.GET)
	public Optional<Impuesto> getFechaLiquidacion(@PathVariable("fechaLiquidacion") Date fechaLiquidacion){
		return impRepo.findByDateAt(fechaLiquidacion);
	}
	
	
	@RequestMapping(value="/usuario/add", method=RequestMethod.POST)
	public Usuario createUser(@RequestBody Usuario body) {
		return usuarioRepo.save(body);
		
	}
	
	@RequestMapping(value="/impuesto/add", method=RequestMethod.POST)
	public Impuesto createImp(@RequestBody Impuesto body) {
		return impRepo.save(body);
		
	}
	
}
