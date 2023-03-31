package com.objectEx;

public class LibMain {
	
	public static void main(String[] args) {
		// 1. 도서관 생성
		Libary lib = new Libary();
		// 2. 책 생성 : 배열에 5권의 책을 생성
		lib.addBook();
		// 3. 재정의 된 메소드 호출
		System.out.println(lib.toString());
	}

}
