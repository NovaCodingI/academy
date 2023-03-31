package com.libary;

import java.util.ArrayList;
import java.util.List;

public class Libary_bk {
	
	List<Book> bookList = new ArrayList<>();

	public Libary_bk() {
		
	}
	
	public Libary_bk(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(null);
	}
	
	
	@Override
	public String toString() {
//		String res = "";
		for(Book book : bookList) {
			// The left-hand side of an assignment must be a variable
//			res += book.getTitle() + "/" + book.getAuthor() + "/" + book.isRent();
			System.out.println(book.getTitle() + "/" + book.getAuthor() + "/" + book.isRent());
		}
		
		return super.toString();
	}

}
