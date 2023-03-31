package com.objectEx;

public class Libary {
	
//	public static void main(String[] args) {
//		Libary lib = new Libary();
//		
////		// 책을 생성
////		Book book1 = new Book("혼공자", "신용권");
////		Book book2 = new Book("자바의정석", "할아버지");
////		Book book3 = new Book("자바의정석1", "할아버지1");
////		Book book4 = new Book("자바의정석2", "할아버지2");
////		Book book5 = new Book("자바의정석3", "할아버지3");
////		
////		// 도서관의 책배열에 추가
////		lib.addBook(0, book1);
////		lib.addBook(1, book2);
////		lib.addBook(2, book3);
////		lib.addBook(3, book4);
////		lib.addBook(4, book5);
//		
//		System.out.println(lib.toString());
//	}
	
	// 책 리스트
	private Book[] bookArry = new Book[5];
	
	/**
	 * 책 리스트 추가
	 */
	public void addBook() {
//		bookArry[index] = book;
		bookArry[0] = new Book("혼자공부하는자바", "김기덕");
		bookArry[1] = new Book("포켓몬스터", "박찬식");
		bookArry[2] = new Book("디지몬", "이강인");
		bookArry[3] = new Book("디아블로", "나윤권");
		bookArry[4] = new Book("너무졸려요", "윤상현");
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Book b :bookArry) {
//			str += b.getTitle() + " " + b.getAuthor() + "\n";
			str += b.toString() + "\n";
		}
//		return super.toString();
		return str;
	}
//	private Book[] bookArry;
//	
//	public Libary() {
//		bookArry = new Book[5];
//	}
	
}
