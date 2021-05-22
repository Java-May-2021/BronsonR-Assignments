package com.bronson.code.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String mainPage(HttpSession session) {
		session.setAttribute("error", false);
		return "main.jsp";
	}
	@PostMapping("/")
	public String input( @RequestParam(value="code") String code , HttpSession session) {
		if (code.equals("dojo")) {
			return "redirect:/code";			
		} else {
			session.setAttribute("error", true);
			return "redirect:/";
		}
	}
	
	@GetMapping ("/code")
	public String code() {
		return "code.jsp";
	}
}
