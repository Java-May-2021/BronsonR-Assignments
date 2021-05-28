package com.bronson.show.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bronson.show.models.Book;
import com.bronson.show.services.BookService;

@Controller
public class HomeController {
	@Autowired
	private BookService bService;
	

	@GetMapping("/")
	public String index(){
		return "index.jsp";
	}
	
	@GetMapping("/{id}")
	public String bookById(Model viewModel, @PathVariable("id") Long id) {
		Book book = bService.getOneBook(id);
		viewModel.addAttribute("Book", book);
		return "index.jsp";
	}
}
