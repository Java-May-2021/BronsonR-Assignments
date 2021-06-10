package com.bronson.dl.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bronson.dl.models.License;

public interface LicenseRepo extends CrudRepository<License, Long> {
	List<License> findAll();
	public License findTopByOrderByNumberDesc();
	
}
