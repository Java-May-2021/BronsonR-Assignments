package com.bronson.dl.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.dl.models.Person;
import com.bronson.dl.repositories.PersonRepo;

@Service
public class PersonService {
	private final PersonRepo pRepo;
	public PersonService (PersonRepo repo) {
		this.pRepo = repo;
	}
	
	//get all people
	public List<Person> getAll(){
		return this.pRepo.findAll();
	}
	
	//create a person
	public Person createNew(Person person) {
		return this.pRepo.save(person);
	}
	
	//get person by id
	public Person getById(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
}
