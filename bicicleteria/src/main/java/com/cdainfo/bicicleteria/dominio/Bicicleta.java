package com.cdainfo.bicicleteria.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicicleta {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "rodado")
	private Integer rodado;
	
	@Column(name = "price")
	private Double price;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getRodado() {
		return rodado;
	}
	public void setRodado(Integer rodado) {
		this.rodado = rodado;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	@Override
    public String toString() {
		return "Bicicleta: \n" +
				 "   id: " + this.id +
	                "\n   brand: " + this.brand +
	                "\n   type: " + this.type +
	                 "\n   color: " + this.color +
	                 "\n   rodado: " + this.rodado +
	                 "\n   price: " + this.price;
	}
	

}


//CREATE TABLE `bicicleteria`.`bicicleta` (
//		  `id` INT NOT NULL AUTO_INCREMENT,
//		  `brand` VARCHAR(45) NULL,
//		  `type` VARCHAR(20) NULL,
//		  `color` VARCHAR(20) NULL,
//		  `rodado` INT NULL,
//		  `price` DOUBLE NOT NULL,
//		  PRIMARY KEY (`id`));
