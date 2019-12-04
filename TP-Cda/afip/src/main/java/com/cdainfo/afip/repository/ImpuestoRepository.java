package com.cdainfo.afip.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cdainfo.afip.dominio.Impuesto;


public interface ImpuestoRepository extends JpaRepository<Impuesto, Long> {
	
	Optional<Impuesto> findByTipo(String tipo);
	
	@Query(value="SELECT i FROM impuestos i WHERE i.fechaLiquidacion LIKE :fechaLiquidacion", 
			nativeQuery = true)
     Optional<Impuesto> findByDateAt(@Param("fechaLiquidacion") Date fechaLiquidacion);
	
	@Query(value="SELECT i.tipo , u.claveFiscal FROM impuestos i FETCH JOIN usuarios u ON i.claveFiscal = u.claveFiscal", 
			nativeQuery = true)
	 List<Impuesto> findTipoByClaveFiscal(Long claveFiscal);
	
}
