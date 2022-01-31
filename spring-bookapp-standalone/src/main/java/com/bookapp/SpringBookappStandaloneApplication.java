package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappStandaloneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappStandaloneApplication.class, args);
	}
    
	@Autowired
	IBookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("All books");
		bookService.getAll().forEach(System.out::println);
		
		System.out.println("Books by author");
		bookService.getByAuthor("rahul").forEach(System.out::println);
		
		System.out.println("Books by category");
		bookService.getByCategory("tech").forEach(System.out::println);
	    
		System.out.println("Books by id");
		Book book = bookService.getById(2);
		System.out.println(book);
	}

}
