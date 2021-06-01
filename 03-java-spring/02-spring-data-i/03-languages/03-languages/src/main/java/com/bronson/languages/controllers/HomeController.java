package com.bronson.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bronson.languages.model.Language;
import com.bronson.languages.service.LangService;


@Controller
public class HomeController {
	@Autowired
	private LangService lService;
	
	@GetMapping("/languages")
	public String main(Model viewModel) {
		viewModel.addAttribute("allLanguages", this.lService.getAll());
		return "Dashboard.jsp";
	}
	
	@PostMapping("/languages")
	public String mainAddNew(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "/languages";
		}else {
			lService.createNew(lang);
			return "redirect:/languages";
		}
	}
	
	@GetMapping("/languages/{id}")
	public String viewEntry(@PathVariable("id") Long id, Model viewModel) {
		Language lang = lService.getOne(id);
		viewModel.addAttribute("lang", lang);
		return "viewEntry.jsp";
	}
	
	@GetMapping("/languages/edit/{id}")
	public String viewEditPage(@PathVariable("id") Long id, Model viewModel) {
		Language lang = lService.getOne(id);
		viewModel.addAttribute("lang", lang);
		return "editEntry.jsp";
	}
	
	@PutMapping("/language/edit/{id}")
	public String sumbitEdit(@PathVariable("id") Long id,  @Valid @ModelAttribute("lang") Language lang, BindingResult result, 
			@RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("version") String version) {
		if(result.hasErrors()) {
			return "editEntry.jsp";
		}else {
			lService.updateEntry(id, name, creator, version);
			return "redirect:/languages";
		}
	}
	
	@DeleteMapping("/language/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		lService.deleteEntry(id);
		return "/languages";
	}
	
	

}
