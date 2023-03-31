package com.libary;

public class Application {
	
	public static void main(String[] args) {
		Libary lib = new Libary();
		
		// 책 추가
		lib.addBook("혼자바", "박용권");
		lib.addBook("혼자바1", "박용권1");
		lib.addBook("혼자바2", "박용권2");
		lib.addBook("혼자바3", "박용권3");
		lib.addBook("혼자바4", "박용권4");
		
		// 책 정보 출력
		lib.toString();
		
		System.out.println("삭제할 책 번호를 선택 해주세요.");
		int i = 0;
		// 책 삭제
		lib.removeBook(i);
		
		// 책 정보 출력
		lib.toString();
//		 System.out.println( lib.toString() ); //  @Override - return super.toString(); 리턴을 return ""; 로 바꿔주면 된다.
		// toString을 사용하고 싶지 않다면 메소드를 만들어서 진행하면된다.
		
		// 책대여 : book.isRent = true
		System.out.println("대여할 책 번호를 선택 해주세요.");
		i = 0;
		lib.updateBook(i);
		
		// 책 정보 출력
		lib.toString();
		// 검증 : 책의 목록의 사이즈보다 큰 값이 입력되었을때 다시 입력 받을 수 있도록
		
	}
}
