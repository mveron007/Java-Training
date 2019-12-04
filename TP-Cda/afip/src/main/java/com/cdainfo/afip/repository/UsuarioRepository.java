package com.cdainfo.afip.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdainfo.afip.dominio.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	Optional<Usuario> findByClaveFiscal (Long claveFiscal);
}