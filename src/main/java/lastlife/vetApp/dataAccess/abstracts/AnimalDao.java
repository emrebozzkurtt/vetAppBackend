package lastlife.vetApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import lastlife.vetApp.entities.concretes.Animal;

public interface AnimalDao extends JpaRepository<Animal, Integer> {
	
}
