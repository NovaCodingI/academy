package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	
	List<Book> getBookList();
	
	int insertBook(List<Book> list);
	int deleteBook(List<Book> list);
	int updateBook(List<Book> list);

}
