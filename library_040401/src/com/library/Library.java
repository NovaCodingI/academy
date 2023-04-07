package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	private List<Book> list;
	private Dao dao = new FileDao();
	
	public Library() {
		list = dao.getList();
	}
	
	public boolean insert(int no, String title
							, String author, boolean isRent) {
		
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		Book book = new Book(no, title, author, isRent);
		list.add(book);
		boolean res = dao.saveFile(list);
		if(res) {
			return true;
		} else {
			list.remove(book);
			return false;
		}
	}
	
	@Override
	public String toString() {
		String listStr = "";
		for(Book book : list) {
			listStr += book.toString() + "\n";
		}
		return listStr;
	}
	
	public Library(String type) {
		if(type.equalsIgnoreCase("DB")) {
			dao = new DatabaseDao();
		}
	}

}
