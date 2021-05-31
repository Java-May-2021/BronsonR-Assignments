package com.bronson.show.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bronson.show.models.Book;
import com.bronson.show.services.BookService;

@Controller
public class HomeController {
	@Autowired
	private BookService bService;
	
	@GetMapping("/books")
	public String homePage() {
		return "index.jsp";
	}
	
	@PostMapping("/books")
	public String makeNewBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            bService.createBook(book);
            return "redirect:/books";
        }
    }
	
	@GetMapping("/books/{id}")
	public String bookDisplay(@PathVariable("id") Long id) {
		return "showBook.jsp";
	}
	
	@GetMapping("books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
	
	@RequestMapping("/books/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bService.getOneBook(id);
        if (book != null){
            model.addAttribute("book", book);
            return "editBook.jsp";
        }else{
            return "redirect:/books";
        }
    }
	
    @PostMapping("/books/edit/{id}")
    public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "editBook.jsp";
        }else{
            bService.updateBook(id, book);
            return "redirect:/books";
        }
    }
    
    @PostMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
    	return "index.jsp";
    }

	
	@PutMapping
	public String update(@PathVariable("book") Long id) {
		return "updated.jsp";
	}
}
