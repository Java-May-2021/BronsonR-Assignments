package com.bronson.pnc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bronson.pnc.models.Category;

@Repository
public interface CateRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	
}
