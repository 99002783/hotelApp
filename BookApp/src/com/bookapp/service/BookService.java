package com.bookapp.service;

import java.util.*;

import com.bookapp.model.Book;

public interface BookService {
	List<Book> getAllBook();
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String Category);
	Book grtById(int id);
	
}
