package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library { // Library class 시작
	
	List<Book> list = null;
	Dao dao = new FileDao();
	
	Library(){
		
		list = dao.getList();
		System.out.println(toString());
		
	}
	
	@Override
	public String toString() {
		System.out.println("책목록 ===== lib.toString()");
		String info = "";
		
		for(Book book : list) {
			info += book.toString() + "\n";
		}
		return info;
	}
	
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("일련번호가 중복되었습니다. \n 확인 후 다시입력해주세요.");
				return false;
			}
		}
		
		Book book = new Book(no, title, author, isRent);
		
		list.add(book);
		
		boolean res = dao.listToFile(list);
		
		if(!res) {
			list.remove(book);
			System.err.println("책이 등록되지 않았습니다. \n 관리자에게 문의해주세요.");
			return false;
		}
		System.out.println("책이 등록 되었습니다.");
		System.out.println(toString());
		return true;
	}
	
	public boolean deleteBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				
				list.remove(book);
				
				boolean res = dao.listToFile(list);
				if(!res) {
					list.add(book);
					System.err.println("파일 출력도중 오류가 발생 하였습니다. \n Library.deleteBook()");
					return false;
				}
				System.out.println("등록한 책이 삭제 되었습니다.");
				System.out.println(toString());
				return true;
			}
		}
		System.err.println("일치하는 일련번호가 없습니다. \n 일련번호를 확인해주세요");
		return false;
	}
	
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(!book.isRent()) {
					book.setRent(true);
					
					boolean res = dao.listToFile(list);
					if(!res) {
						book.setRent(false);
						System.err.println("파일로 출력하는데 실패 했습니다.");
					}
					System.out.println("도서가 대여처리 되었습니다.");
					System.out.println(toString());
					return true;
				}
			}
		}
		System.err.println("일련번호를 찾을 수 없습니다.");
		return false;
			
	}
	
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					book.setRent(false);
					dao.listToFile(list);
					System.out.println("반납 되었습니다.");
					System.out.println(toString());
					return true;
				} else {
					System.err.println("반납 가능한 도서가 아닙니다.");
				}
			}
		}
		System.err.println("일련번호에 해당하는 책이 존재하지 않습니다. \n 일련번호를 다시 작성해주세요.");
		return false;
	}
	
		
		
		
		
		
		
		
		
	} // Library class 끝
	

