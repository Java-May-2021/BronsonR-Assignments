package com.bronson.pnc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.pnc.models.Category;
import com.bronson.pnc.models.Product;
import com.bronson.pnc.repositories.ProdRepository;

@Service
public class ProdService {
	private final ProdRepository pRepo;
	public ProdService(ProdRepository repo) {
		this.pRepo = repo;
	}

	
	//get all
	public List<Product> getAll(){
		return this.pRepo.findAll();
	}
	
	//get by Id
	public Product getById(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//add product
	public Product createProd(Product product) {
		return this.pRepo.save(product);
	}
	
	
}
