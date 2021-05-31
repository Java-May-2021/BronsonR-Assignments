package com.bronson.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bronson.show.models.Book;
import com.bronson.show.services.BookService;

@RestController
@RequestMapping("/api")
public class APIcontroller {
	@Autowired
	private BookService bService;
	
	
	@GetMapping("/books")
	public List<Book> index(){
		return this.bService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book bookById(Model viewModel, @PathVariable("id") Long id) {
		Book book = bService.getOneBook(id);
		viewModel.addAttribute("Book", book);
		return bService.getOneBook(id);
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
	 
	@PutMapping("/books/edit/{id}")
	public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String description, @RequestParam(value="language") String language, @RequestParam(value="pages") Double pages) {
        Book book = bService.updateBookFull(id, title, description, language, pages);
        return book;
	}
	
	@DeleteMapping("/books/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		bService.deleteBook(id);
	}
}
