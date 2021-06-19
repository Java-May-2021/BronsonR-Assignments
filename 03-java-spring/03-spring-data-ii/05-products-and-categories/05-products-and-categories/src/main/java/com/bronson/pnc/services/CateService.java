package com.bronson.pnc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.pnc.models.Category;
import com.bronson.pnc.repositories.CateRepository;

@Service
public class CateService {
	private final CateRepository cRepo;
	public CateService(CateRepository repo) {
		this.cRepo = repo;
	}
	
	//get all
	public List<Category> getAll(){
		return this.cRepo.findAll();
	}
	
	//get by ID
	public Category getById(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	//create category
	public Category createCate(Category category) {
		return this.cRepo.save(category);
	}
	

}


