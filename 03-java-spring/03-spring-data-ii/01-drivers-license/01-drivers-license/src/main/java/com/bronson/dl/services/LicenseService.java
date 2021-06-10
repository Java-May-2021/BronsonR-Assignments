package com.bronson.dl.services;

import org.springframework.stereotype.Service;

import com.bronson.dl.models.License;
import com.bronson.dl.repositories.LicenseRepo;

@Service
public class LicenseService {
	private final LicenseRepo lRepo;
	public LicenseService (LicenseRepo repo) {
		this.lRepo = repo;
	}
	
	//create a license
	public License createNew(License license) {
		license.setNumber(this.generateLicenseNumber());
		return this.lRepo.save(license);
	}
	
	//get single id
	public License getById(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public int generateLicenseNumber() {
		License l = lRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	
}

