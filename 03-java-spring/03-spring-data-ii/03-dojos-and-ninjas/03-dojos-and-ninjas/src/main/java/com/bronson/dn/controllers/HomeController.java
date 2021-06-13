package com.bronson.dn.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bronson.dn.models.Dojo;
import com.bronson.dn.models.Ninja;
import com.bronson.dn.services.DojoService;
import com.bronson.dn.services.NinjaService;

@Controller
public class HomeController {
	@Autowired
	private DojoService dServ;
	@Autowired
	private NinjaService nServ;
	
	@GetMapping("/")
	public String createDojo(@ModelAttribute("doj") Dojo dojo) {
		return "createDojo.jsp";
	}
	
	@PostMapping("/")
	public String addDojo(@Valid @ModelAttribute("doj") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "createDojo.jsp";
		}
		this.dServ.createNew(dojo);
		return "redirect:/ninja";
	}
	
	@GetMapping("/ninja")
	public String createNinja(@ModelAttribute("nin") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("allDojos", this.dServ.getAll());
		return "createNinja.jsp";
	}
	
	@PostMapping("/ninja")
	public String addNinja(@Valid @ModelAttribute("nin") Ninja ninja, BindingResult result, Model viewModel) {
		Long dojoId = ninja.getDojo().getId();
		if (result.hasErrors()) {
			viewModel.addAttribute("allDojos", this.dServ.getAll());
			return "createNinja.jsp";
		}
		this.nServ.createNew(ninja);
		return "redirect:/dojo/{id}" + dojoId;
	}
	
	@GetMapping("/dojo/{id}")
	public String showDojo(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("dojo", this.dServ.getById(id));
		viewModel.addAttribute("allNinjas", this.nServ.getAll());
		return "dojoRoster.jsp";
	}
}
