package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service

public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;

	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		
		Book newBook =bookRepository.save(book);
		return newBook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookid);
		return true;
	}

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		bookRepository.findById(bookid).orElseThrow(()->new BookNotFoundException("Id not available"));
		
		
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> getBookbycategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookRepository.findByCategoryOrderByTitle(category);
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitleAndAuthor(title, author);
	}

	@Override
	public List<Book> findBookByTitleAndPrice(String title, Double Price) {
		// TODO Auto-generated method stub
		return bookRepository.findBookByTitleAndPrice(title, Price);
	}

}
