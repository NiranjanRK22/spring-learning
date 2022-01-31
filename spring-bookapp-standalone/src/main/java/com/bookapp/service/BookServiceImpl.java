package com.bookapp.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

@Service
public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		return showBookList()
				.stream()
				.sorted(Comparator.comparing(Book::getTitle))
				.collect(Collectors.toList());
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> booksByAuthor =  showBookList()
				.stream()
				.filter(book->book.getAuthor().equals(author))
				.sorted(Comparator.comparing(Book::getTitle))
				.collect(Collectors.toList());
		if (booksByAuthor.isEmpty())  
			throw new BookNotFoundException("Author not found");
			
		return booksByAuthor;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		return showBookList()
				.stream().filter(book->book.getBookId()==bookId)
				.findAny()
				.orElseThrow(()-> new BookNotFoundException("invalid id"));
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> booksByCategory = showBookList()
				.stream()
				.filter(book->book.getCategory().equals(category))
				.sorted(Comparator.comparing(Book::getTitle))
				.collect(Collectors.toList());
		if (booksByCategory.isEmpty())
			throw new BookNotFoundException("category not found");
		return booksByCategory;
	}
	
	private List<Book> showBookList()  {
		return Arrays.asList(
				new Book("java", "kathy", "tech", 1, 400),
				new Book("python", "rahul", "tech", 2, 500),
				new Book("wings", "apj", "motivation", 3, 700),
				new Book("spring", "priya", "tech", 4, 800),
				new Book("angular", "virat", "frontend", 5, 300),
				new Book("react", "niranjan", "frontend", 6, 700)
				);
	}

}
