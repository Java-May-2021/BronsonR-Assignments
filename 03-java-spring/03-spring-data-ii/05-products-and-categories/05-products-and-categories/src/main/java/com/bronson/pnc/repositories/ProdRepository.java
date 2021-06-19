package com.bronson.pnc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bronson.pnc.models.Category;
import com.bronson.pnc.models.Product;

@Repository
public interface ProdRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	
}
