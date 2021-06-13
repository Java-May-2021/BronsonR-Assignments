package com.bronson.dn.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.dn.models.Dojo;
import com.bronson.dn.repositories.DojoRepo;

@Service
public class DojoService {
	private final DojoRepo dRepo;
	public DojoService (DojoRepo repo) {
		this.dRepo = repo;
	}
	
	//get all dojos
	public List<Dojo> getAll(){
		return this.dRepo.findAll();
	}
	
	//get dojo by id
	public Dojo getById(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	//create dojo
	public Dojo createNew(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//edit dojo
	public Dojo updateEntry(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
}
