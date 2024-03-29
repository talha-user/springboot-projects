package com.application.library.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.library.entity.Book;
import com.application.library.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	
	public List<Book> findAllBooks(){
		return bookRepo.findAll();
	}
	public Book findBookById(Long id) {
		return bookRepo.findById(id).orElseThrow(()-> new RuntimeException());
	}
	public void createBook(Book book) {
		bookRepo.save(book);
	}
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
