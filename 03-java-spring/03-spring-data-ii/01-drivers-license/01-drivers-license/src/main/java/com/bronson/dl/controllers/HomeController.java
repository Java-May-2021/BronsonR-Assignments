package com.bronson.dl.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bronson.dl.models.License;
import com.bronson.dl.models.Person;
import com.bronson.dl.services.LicenseService;
import com.bronson.dl.services.PersonService;

@Controller
public class HomeController {
	@Autowired
	private LicenseService lServ;
	@Autowired
	private PersonService pServ;

	public HomeController(LicenseService serv1, PersonService serv2) {
		this.lServ = serv1;
		this.pServ = serv2;
	}
	
	@GetMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	
	@GetMapping("/person/new")
	public String newPerson(@ModelAttribute("per") Person person) {
		return "createPerson.jsp";
	}
	
	@PostMapping("/person/new")
	public String addPerson(@Valid @ModelAttribute("per") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "createPerson.jsp";
		}
		this.pServ.createNew(person);
		return "redirect:/license/new";
		
	}
	
	@GetMapping("license/new")
	public String newLicense(@ModelAttribute("lice") License license, Model viewModel) {
		viewModel.addAttribute("allPerson", this.pServ.getAll());
		return "createLicense.jsp";
	}
	
	@PostMapping("/license/new")
	public String addLicense(@Valid @ModelAttribute("lice") License license, BindingResult result, Model viewModel) {
		if (result.hasErrors()) {
			viewModel.addAttribute("allPerson", this.pServ.getAll());
			return "createLicense.jsp";
		}
		this.lServ.createNew(license);
		return "redirect:/";
	}
	
	@GetMapping("/person/{id}")
	public String showPerson(@PathVariable("id")Long id, Model viewModel) {
		Person viewPer = this.pServ.getById(id);
		viewModel.addAttribute("pers", viewPer);
		return "viewInfo.jsp";
	}
}
