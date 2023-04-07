package com.library;

public class App {
	
	public static void main(String[] args) {
		
		Library lib = new Library();
		System.out.println(lib.toString());
		lib.insert(5, "오늘도", "우리는", false);
		System.out.println("오늘도 우리는 추가 테스트===========");
//		System.out.println(lib.toString());
		
		
//		FileDao dao = new FileDao();
//		List<Book> list = dao.getList();
//		
//		System.out.println("생성된 도서 리스트 출력 ==========");
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}
		
	}
}
