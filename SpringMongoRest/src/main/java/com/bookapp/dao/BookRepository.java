package com.bookapp.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book,Integer>  {
	
	List<Book> findByAuthor(String author);
    List<Book> findByCategoryOrderByTitle(String category);
    List<Book> findByTitleAndAuthor(String title,String author);
    //jpql queries
    @Query("FROM Book b WHERE b.title=?1 AND b.price>?2")
    List<Book> findBookByTitleAndPrice(String title,Double price);
	
	
	

}
