package com.bronson.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bronson.languages.model.Language;
import com.bronson.languages.service.LangService;

@RestController
@RequestMapping("/api")
public class APIController {
	@Autowired
	private LangService lService;
	
	//Show all the languages to the page when called through main controller
	@GetMapping("/languages")
	public List<Language> dashboard(Model viewModel){
		return this.lService.getAll();
		
	}
	
	//create an entry
	@PostMapping("/languages")
	public Language update(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator,
			@RequestParam(value="version") String version) {
		Language newLang = lService.createManual(name, creator, version);
		return newLang;
	}
	
	//show a single entry by its ID
	@GetMapping("/languages/{id}")
	public Language langById(Model viewModel, @PathVariable("id") Long id) {
		Language lang = lService.getOne(id);
		viewModel.addAttribute("lang", lang);
		return lService.getOne(id);
	}
	
	//Show the entry to be edited
	@RequestMapping("/languages/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model viewModel) {
		Language lang = lService.getOne(id);
		if (lang != null) {
			viewModel.addAttribute("lang", lang);
			return "editPage.jsp";
		}else {
			return "redirect:/languages";
		}
	}
	
	//Updating an entry
	@PutMapping("/languages/edit/{id}")
	public Language update(@PathVariable("id") Long id, @RequestParam(value="name") String name, @RequestParam(value="creator") String creator,
			@RequestParam(value="version") String version) {
		Language updated = lService.updateEntry(id, name, creator, version);
		return updated;
	}
	
	//Delete an entry
	//@DeleteMapping("/languages/delete/{id}")
	//public void deleteEntry(@PathVariable("id") Long id) {
	//	lService.deleteEntry(id);
	//}
	
	
}
