package com.cdainfo.afip.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="usuarios")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private Long idUsuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="claveFiscal")
	private Long claveFiscal;
	
	@ManyToOne
	private Impuesto impuesto;
	
	
	public Usuario(Long idUsuario, String nombre, String apellido, Long claveFiscal) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.claveFiscal = claveFiscal;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getClaveFiscal() {
		return claveFiscal;
	}

	public void setClaveFiscal(Long claveFiscal) {
		this.claveFiscal = claveFiscal;
	}

	@Override
    public String toString() {
		return "Usuario: \n" +
				 "   id: " + this.idUsuario +
	                "\n   nombre: " + this.nombre +
	                "\n   apellido: " + this.apellido +
	                 "\n   clave : " + this.claveFiscal;
	}

}


//CREATE TABLE `afip`.`usuarios` (
//		  `idUsuario` INT NOT NULL AUTO_INCREMENT,
//		  `nombre` VARCHAR(25) NOT NULL,
//		  `apellido` VARCHAR(25) NULL,
//		  `claveFiscal` INT NOT NULL,
//		  PRIMARY KEY (`idUsuario`));

