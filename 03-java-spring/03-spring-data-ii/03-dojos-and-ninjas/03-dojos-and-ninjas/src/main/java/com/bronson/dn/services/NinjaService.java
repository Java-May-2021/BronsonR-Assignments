package com.bronson.dn.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.dn.models.Ninja;
import com.bronson.dn.repositories.NinjaRepo;

@Service
public class NinjaService {
	private final NinjaRepo nRepo;
	public NinjaService (NinjaRepo repo) {
		this.nRepo = repo;
	}
	
	//get all ninjas
	public List<Ninja> getAll(){
		return this.nRepo.findAll();
	}
	
	//get ninja by id
	public Ninja getById(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	//create ninja
	public Ninja createNew(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//update ninja
	public Ninja updateEntry(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
}
