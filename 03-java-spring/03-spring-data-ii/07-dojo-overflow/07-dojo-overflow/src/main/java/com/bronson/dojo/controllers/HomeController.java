package com.bronson.dojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bronson.dojo.models.Answer;
import com.bronson.dojo.models.Question;
import com.bronson.dojo.models.Tag;
import com.bronson.dojo.services.SuperService;

@Controller
public class HomeController {
	@Autowired
	private SuperService serv;
	
	
	//get mapping for dashboard
	@GetMapping("/")
	public String dashboard(Model viewModel) {
		viewModel.addAttribute("allQuestions", this.serv.getAllQue());
		return "dashboard.jsp";
	}
	
	//get mapping for New Question page
	@GetMapping("/question/new")
	public String newQuestion(@ModelAttribute("que") Question query, @ModelAttribute("tag") Tag subject) {
		return "newQuestion.jsp";
	}
	
	//post mapping for New Question
	//Will take in a question and a tag via JSP forms, use model attribute and possibly use request param for connection
	@PostMapping("/question/new")
	public String addedQuestion(@Valid @ModelAttribute("que") Question query, @ModelAttribute("ans") Tag subject, BindingResult result) {
		if(result.hasErrors()){
			return "newquestion.jsp";
		}
		this.serv.createQuestion(query); //saved individually
		this.serv.createTag(subject);
		this.serv.questTags(query, subject); //connection for the connection database table
		return "redirect:/";             
	}
	
	//get mapping for Answer page
	@GetMapping("/question/{id}")
	public String viewQuestion(@ModelAttribute("ans") Answer response, @PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("allTags", this.serv.getAllTag()); //re-look at previous project for the filtering of the included attributes
		return "answer.jsp";
	}
	
	//post mapping for Answer page ("/
	//Will take in a single JSP form, use path variable to save and connect the answer to the question
	@PostMapping("/question/{id}")
	public String addAnswer(@Valid @ModelAttribute Answer response, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("allTags", this.serv.getAllTag()); //re-look at previous project for the filtering of the included attributes
			return "answer.jsp";
		}
		this.serv.createAnswer(response); 
		return "redirect:/question/{id}";
	}

}
