package com.cda.test.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicicleta {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="color")
	private String color;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="precio")
	private Double precio;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
}



//CREATE TABLE `bici_market`.`bicicleta` (
//		  `id` INT NOT NULL AUTO_INCREMENT,
//		  `color` VARCHAR(45) NULL,
//		  `modelo` VARCHAR(45) NULL,
//		  `precio` DOUBLE NOT NULL,
//		  PRIMARY KEY (`id`));

