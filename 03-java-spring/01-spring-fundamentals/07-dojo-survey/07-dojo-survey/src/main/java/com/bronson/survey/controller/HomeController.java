package com.bronson.survey.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "main.jsp";
	}
	
	@PostMapping("/")
	public String surveyInfo(@RequestParam("name") String name, @RequestParam("location") String location,
			@RequestParam("language") String language, @RequestParam("comment") String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/review";
	}
	
	@GetMapping("/review")
	public String reviewInfo() {
		return "review.jsp";
	}

}
