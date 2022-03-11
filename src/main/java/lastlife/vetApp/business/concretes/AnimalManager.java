package lastlife.vetApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lastlife.vetApp.business.abstracts.AnimalService;
import lastlife.vetApp.dataAccess.abstracts.AnimalDao;
import lastlife.vetApp.entities.concretes.Animal;

@Service
public class AnimalManager implements AnimalService {

	private AnimalDao animalDao;

	@Autowired
	public AnimalManager(AnimalDao animalDao) {
		super();
		this.animalDao = animalDao;
	}


	@Override
	public List<Animal> getAll() {
		// TODO Auto-generated method stub
		return animalDao.findAll();
	}

}
