package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Animal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "especie")
	private String especie;
	
	@Column(name = "color")
	private String color;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
    public String toString() {
        return "Animal: \n" +
                "   id: " + this.id +
                "\n   especie: " + this.especie +
                "\n   color: " + this.color;
    }

}

//CREATE TABLE `animales`.`animal` (
//		  `id` INT NOT NULL AUTO_INCREMENT,
//		  `especie` VARCHAR(20) NOT NULL,
//		  `color` VARCHAR(20) NULL,
//		  PRIMARY KEY (`id`));
// INSERT INTO `animales`.`animal` (`id` , `especie`, `color`) VALUES (DEFAULT , 'Leon', 'marron');

