package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dominio.Animal;



@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

	List<Animal> findAllByNameLike(String especie);

  
	
}
