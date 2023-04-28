package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookService {
	// 생성자가 없어도 기본생성자가 있으므로 사용할수있다!
	BookDao dao = new BookDao();
	
	/**
	 * 책 리스트를 조회 합니다.
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = dao.getList();
		
		// 내가 생성한 변수에다 담아주기 list
		for(Book book : list) {
			System.out.println(book);
		}
		return list;
	}
	
//	public boolean insertBook(int no, String title, String author) {
//		
//		Book book = new Book(title, author);
//		int res = dao.insert(book);
//		return  res>0 ? true : false;
//	} 
// 컨트롤러에 따로 등록할 일이없음 void로 진행하자!!
	/**
	 * 도서정보 입력
	 * @param title
	 * @param author
	 */
	public void insert(String title, String author) {
		Book book = new Book(title, author);
		int res = dao.insert(book);
		if(res>0) {
			System.out.println(res + "건 입력 되었습니다.");
		} else {
			System.err.println("입력중 오류가 발생 하였습니다.");
			System.err.println("관리자에게 문의 해주세요");
		}
	}
	
	public void delete(int no) {
		int res = dao.delete(no);
		if(res>0) {
			System.out.println(res + "건 삭제 되었습니다.");
		} else {
			System.err.println("삭제중 오류가 발생하였습니다.");
			System.err.println("관리자에게 문의 해주세요");
		}
	}

	public void rentBook(int bookNo) {
		// 대여가능한 도서인지 확인
		String rentYN = dao.getRentYN(bookNo);
		if("Y".equals(rentYN)) {
			System.err.println("이미 대여중인 도서 입니다.");
		} else if ("".equals(rentYN)){
			System.err.println("없는 도서 번호 입니다");
			System.err.println("관리자에게 문의해주세요");
		}
		// 대여처리
		int res = dao.update(bookNo, "Y");
		
		if(res>0) {
			System.out.println(res + "건 대여 되었습니다");
		} else {
			System.err.println("대여중 오류가 발생하였습니다.");
			System.err.println("관리자에게 문의 해주세요");
		}
	}

	public void returnBook(int bookNo) {
		// 반납가능한 도서인지 확인
		String rentYN = dao.getRentYN(bookNo);
		if("N".equals(rentYN)) {
			System.err.println("반납가능한 상태가 아닙니다.");
		} else if ("".equals(rentYN)){
			System.err.println("없는 도서 번호 입니다");
			System.err.println("관리자에게 문의해주세요");
		}
		// 반납처리
		int res = dao.update(bookNo, "N");
		
		if(res>0) {
			System.out.println(res + "건 대여 되었습니다");
		} else {
			System.err.println("반납 처리중 오류가 발생하였습니다.");
			System.err.println("관리자에게 문의 해주세요");
		}
	}
}
