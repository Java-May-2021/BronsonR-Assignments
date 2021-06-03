package com.bronson.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.languages.models.Language;
import com.bronson.languages.repositories.LangRepository;

@Service
public class LangService {
	private final LangRepository lRepo;
	
	public LangService(LangRepository repo) {
		this.lRepo = repo;
	}
	
	//Display All
	public List<Language> getAll(){
		return this.lRepo.findAll();
	}
	
	//Display by ID
	public Language getOne(Long id) {
		return this.lRepo.findById(id).orElse(null); //use orElse to bypass optional error
	}
	
	//New entry, HERE IN CASE FORM WILL USE MANUAL ENTRY METHOD
	public Language createNew(Language lang) {
		return this.lRepo.save(lang);
	}
	
	//Manual entry
	public Language createManual(String name, String creator, String version) {
		Language newLang = new Language(name, creator, version);
		return this.lRepo.save(newLang);	
	}
	
	//update entry by object
	public Language updateObject(Language lang) {
		return this.lRepo.save(lang);
	}
	
	//Update entry by ID
	public Language updateEntry(Long id, String name, String creator, String version) {
		Language updated = lRepo.findById(id).orElse(null);
		updated.setName(name);
		updated.setCreator(creator);
		updated.setVersion(version);
		return this.lRepo.save(updated);
	}
	
	//Delete entry by ID
	public void deleteEntry(Long id) {
		this.lRepo.deleteById(id);
	}
}
