package com.bookapp.service;

import java.util.List;

import com.bookapp.doa.BookDAO;
import com.bookapp.doa.bookDAOImpl;
import com.bookapp.model.Book;

public class BookServiceImpl implements BookService {
	BookDAO bookDAO=new bookDAOImpl();

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBook();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAO.getByAuthor(author);
	}

	@Override
	public List<Book> getByCategory(String Category) {
		// TODO Auto-generated method stub
		return bookDAO.getByCategory(Category);
	}

	@Override
	public Book grtById(int id) {
		// TODO Auto-generated method stub
		return bookDAO.grtById(id);
	}

}
