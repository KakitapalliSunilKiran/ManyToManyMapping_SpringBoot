package com.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.model.Author;
import com.manytomany.model.Book;
import com.manytomany.repo.AuthorRepo;
import com.manytomany.repo.BookRepo;
//import com.person.model.Mobile;

@Service
public class ManyToManyService {

	@Autowired
	AuthorRepo authorRepo;
	
	@Autowired
	BookRepo bookRepo;

	public void saveToDb(Author author) {
		
		List<Book> books=author.getBooks();
		for(Book book:books) {
			bookRepo.save(book);
		}
		
		authorRepo.save(author);
		
	}
}
