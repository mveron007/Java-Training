package com.cdainfo.bicicleteria.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdainfo.bicicleteria.dominio.Bicicleta;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
	
	
	List<Bicicleta> findByBrand(String brand);
	
	Optional<Bicicleta> findById(Long id);
	
	
}
