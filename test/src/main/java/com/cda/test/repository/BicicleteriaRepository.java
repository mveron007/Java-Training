package com.cda.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.test.dominio.Bicicleta;

public interface BicicleteriaRepository extends JpaRepository<Bicicleta, Long> {

}
