package com.bronson.show.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.show.models.Book;
import com.bronson.show.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bRepo;
	
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	
	//Display all books
	public List<Book> getAllBooks(){
		return this.bRepo.findAll();
	}
	
	//Display one book
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	//Create book
	public Book createBook(Book book) {
		return this.bRepo.save(book);
	}
	
	//Update book
	public Book updateBook(Book book) {
		return this.bRepo.save(book);
	}
}
