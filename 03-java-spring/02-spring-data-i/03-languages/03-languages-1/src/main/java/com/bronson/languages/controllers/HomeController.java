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

import com.bronson.languages.models.Language;
import com.bronson.languages.services.LangService;

@Controller
public class HomeController {
	@Autowired
	private LangService lService;
	public HomeController (LangService service) {
		this.lService = service;
	}
	
	@GetMapping("/languages")
	public String main(@ModelAttribute("language") Language lang, Model viewModel) {
		viewModel.addAttribute("allLanguages", this.lService.getAll());
		return "dashboard.jsp";
	}
	
	@PostMapping("/languages")
	public String addNewEntry(@Valid @ModelAttribute("language") Language lang, BindingResult result, Model viewModel) {
		if (result.hasErrors()) {
			viewModel.addAttribute("allLanguages", this.lService.getAll());
			return "dashboard.jsp";
		}
			this.lService.createNew(lang);
			return "redirect:/languages";
	}
	
	@GetMapping("/languages/{id}")
	public String viewEntry(@PathVariable("id") Long id, Model viewModel) {
		Language viewLang = this.lService.getOne(id);
		viewModel.addAttribute("lang", viewLang);
		return "showEntry.jsp";
	}
	
	@GetMapping("languages/edit/{id}")
	public String editPage(@ModelAttribute("language") Language lang, @PathVariable("id") Long id, Model viewModel) {
		Language viewLang = this.lService.getOne(id);
		viewModel.addAttribute("lang", viewLang);
		return "editEntry.jsp";
	}
	
	@PostMapping("languages/edit/{id}")
	public String editSubmit(@Valid @ModelAttribute("language") Language lang, BindingResult results, @PathVariable("id") Long id, Model viewModel) {
		if(results.hasErrors()) {
			Language viewLang = this.lService.getOne(id);
			viewModel.addAttribute("lang", viewLang);
			return "editEntry.jsp";
		}
			this.lService.updateObject(lang);
			return "redirect:/languages/{id}";
	}
	
	@DeleteMapping("/languages/delete/{id}")
	public String deleteEntry(@PathVariable("id") Long id) {
		this.lService.deleteEntry(id);
		return "redirect:/languages";
	}
}
