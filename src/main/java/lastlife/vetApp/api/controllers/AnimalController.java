package lastlife.vetApp.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lastlife.vetApp.business.abstracts.AnimalService;
import lastlife.vetApp.entities.concretes.Animal;

@RestController
@RequestMapping("/api/animalController")
public class AnimalController {
	
	private AnimalService animalService;
	
	@Autowired
	public AnimalController(AnimalService animalService) {
		super();
		this.animalService = animalService;
	}

	@GetMapping("/getAll")
	public List<Animal> getAll(){
		return animalService.getAll();
	}
	
}
