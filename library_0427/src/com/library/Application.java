package com.library;

import java.util.List;

import com.library.controller.LibraryController;
import com.library.dao.BookDao;
import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;

public class Application {
	public static void main(String[] args) {
		
		LibraryController lib = new LibraryController();
		lib.library();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		insert 테스트
//		MemberDao dao = new MemberDao();
//		Member member = new Member("user1", "1234", "사용자", null, null, null);
//		dao.insert(member);
		
//		idCheck 테스트
//		dao.idCheck("admin");
//		System.out.println(dao.idCheck("admin")); // false 중복!!
//		System.out.println(dao.idCheck("user01")); // true 사용가능!!
		
//		delete 테스트
//		dao.delete("user");
		
//		Login 테스트
//		MemberDao dao = new MemberDao();
//		System.out.println(dao.login("admin", "1234"));

//		update 테스트
//		BookDao dao = new BookDao();
//		dao.update(12, "Y");
		
		
		
//		delete 테스트
//		BookDao dao = new BookDao();
//		dao.delete(9);
		
//		insert 테스트
//		BookDao dao = new BookDao();		
//		Book book = new Book("불편한편의점2", "나카사키");
//		dao.insert(book);
		
//		getList 테스트
//		BookDao dao = new BookDao();
//		dao.getList();
//		List<Book>list = dao.getList();
//		
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}
		
		// 리스트를 출력하면 리스트의 요소들의 toString이 출력됩니다.
		// []로 묶어서 출력!!
//		BookDao dao = new BookDao();
//		dao.getList().toString(); // -> 출력 안됨 toString은 문자열을 반환
//		System.out.println(dao.getList().toString()); // 출력하려면 해줘야함!!
//		System.out.println("=============================");
//		System.out.println(dao.getList()); // 편하게 하기위해서 toString 을 재정의하는 경우가 많음

		// 출력 테스트
//		Book book = new Book(1, "불편한편의점", "N" , "나카사키");	
//		System.out.println(book.toString());
		
	}
}
