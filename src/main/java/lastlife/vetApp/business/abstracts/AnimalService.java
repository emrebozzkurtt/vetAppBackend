package lastlife.vetApp.business.abstracts;

import java.util.List;

import lastlife.vetApp.entities.concretes.Animal;

public interface AnimalService {
	List<Animal> getAll();
}
