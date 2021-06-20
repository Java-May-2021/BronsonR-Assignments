package com.bronson.pnc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bronson.pnc.models.Category;
import com.bronson.pnc.models.Product;
import com.bronson.pnc.repositories.CateRepository;
import com.bronson.pnc.repositories.ProdRepository;

@Service
public class CateService {
	@Autowired
	private CateRepository cRepo;
	@Autowired
	private ProdRepository pRepo;
	
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
	
	public void catProduct(Category category, Product product) {
		List<Category> catNewProd = product.getCategories();
		catNewProd.add(category);
		this.pRepo.save(product);
	}
	

}


