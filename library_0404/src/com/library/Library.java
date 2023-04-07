package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	// 필드 (전역변수)
	// 클래스 내부에서 어디서든지 사용할 수 있도록 필드 선언
	private List<Book> list;
	// FileDao 또는 DatabaseDao 로 생성 할 수 있도록
	// 인터페이스를 타입으로 선언 
//	private Dao dao = null; Library(){} 기본생성자에 dao = new FileDao(); 을 생략할수있다 아래와같이 private Dao dao = new FileDao();
	private Dao dao = new FileDao();
	
	public Library(){
//		dao = new FileDao();
		// 파일을 읽어서 리스트를 초기화 합니다.
		list = dao.getList();
	}
	
	public boolean insert(int no, String title
								, String author, boolean isRent) {
		// 중복체크
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		
		// 외부로 부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가
		Book book = new Book(no, title, author, isRent);
		// 리스트를 파일에 저장
		list.add(book);
		boolean res = dao.saveFile(list);
		if(res) {
			// 파일에 성공적으로 저장되면 리스트에 추가
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
