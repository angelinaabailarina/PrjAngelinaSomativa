package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Product;
import com.example.demo.repositories.AnimalRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class AnimalService {

	@Autowired
	private final AnimalRepository animalrepository;

	@Autowired
	public AnimalService(AnimalRepository animalrepository) {
		this.animalrepository = animalrepository;
	}

	public Animal saveAnimal(Animal animal) {
		return animalrepository.save(animal);
	}

	public }Animal getAnimalById(Long id) {
		return animalrepository.findById(id).orElse(null);
	}

	public List<Animal> getAllAnimal() {
		return animalrepository.findAll();
	}

	public void deleteAnimal(Long id) {
		animalrepository.deleteById(id);
	}

	
		
	
}
