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
	
	//Create book manually
	public Book creatBookManual(String title, String description, String language, Double pages) {
		Book newBook = new Book(title, description, language, pages);
		return this.bRepo.save(newBook);
	}
	
	//Update book
	public Book updateBook(Long id, Book book) {
		return this.bRepo.save(book);
	}
	
	//Update book full
	public Book updateBookFull(Long id, String title, String description, String language, Double pages) {
		Book updated = bRepo.findById(id).orElse(null);
		updated.setTitle(title);
		updated.setDescription(description);
		updated.setLanguage(language);
		updated.setPages(pages);
		return this.bRepo.save(updated);
	}

	
	//Delete book
	public void deleteBook(Long id) {
		this.bRepo.deleteById(id);
	}
}
