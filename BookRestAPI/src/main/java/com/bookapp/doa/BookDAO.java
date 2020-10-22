package com.bookapp.doa;

import java.util.List;

import com.bookapp.model.Book;

public interface BookDAO {
	List<Book> getAllBook();
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String Category);
	Book grtById(int id);

}
