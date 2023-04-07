package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	private List<Book> bookList = new ArrayList<>();
	
	public Library(List<Book> bookList){
		 this.bookList = bookList;
	}
	
	private Dao dao =null;
	
	
	public Library(String confDao) {
		if("db".equals(confDao)) {
			this.dao = new DatabaseDao();
		} else {
			this.dao = new FileDao();
		}
		
		bookList = dao.getBookList();
		
		System.out.println("라이브러리 생성자");
		System.out.println("도서목록");
		info();
	}
	
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		Book book = new Book(no, title, author, isRent);
		
		bookList.add(book);
		
		dao.insertBook(bookList);
		return true;
		
	}
	
	public boolean rentBook(int index) {
		for(Book book : bookList) {
			if(book.getNo() == index) {
				if(book.isRent()) {
					System.err.println("이미 대여중인 도서입니다.");
					return false;
				}
				book.setRent(true);
				dao.updateBook(bookList);
				return true;
			}
		}
		System.err.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	public boolean deleteBook(int index) {
		for(Book book : bookList) {
			if(book.getNo() == index) {
				dao.deleteBook(bookList);
				return bookList.remove(book);
			}
		}
		System.err.println("일련번호를 찾을수가 없습니다.");
		return false;
	}
	
	public boolean returnBook(int index) {
		for(Book book : bookList) {
			if(book.getNo() == index) {
				if(!book.isRent()) {
					System.err.println("반납 가능한 도서가 아닙니다. \n 관리자에게 문의주세요.");
					dao.updateBook(bookList);
					return false;
				}
				book.setRent(false);
				System.out.println("도서 반납이 완료 되었습니다.");
				return true;
			}
		}
		System.err.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	public void info() {
		System.out.println("도서 목록 ==============");
		for(Book book : bookList) {
			book.info();
		}
		System.out.println("==========================");
	}
	
	

}
