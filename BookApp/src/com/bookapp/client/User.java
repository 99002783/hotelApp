package com.bookapp.client;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService bookService=new BookServiceImpl();
		List<Book> bookList=bookService.getAllBook();
		for(Book book:bookList)
		{
			System.out.println(book);
		}
		
		
		
		
		

	}

}
