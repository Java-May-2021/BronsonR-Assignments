package com.bronson.dl.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bronson.dl.models.Person;

public interface PersonRepo extends CrudRepository<Person, Long> {
	List<Person> findAll();
}
