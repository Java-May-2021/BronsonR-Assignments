package com.bronson.pnc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bronson.pnc.models.Category;
import com.bronson.pnc.models.Product;
import com.bronson.pnc.repositories.CateRepository;
import com.bronson.pnc.repositories.ProdRepository;

@Service
public class ProdService {
	@Autowired
	private ProdRepository pRepo;
	
	@Autowired
	private CateRepository cRepo;
	
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
	
	public void prodCategory(Product product, Category category) {
		List<Product> prodNewCat = category.getProducts();
		prodNewCat.add(product);
		this.cRepo.save(category);
	}
	
	
}
