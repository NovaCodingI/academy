package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		
	Book book0 = new Book();
		
	Book book = new Book("자바의정석", 20000, 0.2, "윤상섭");
	
	Book book1 = new Book("C언어", 30000, 0.1, "홍길동");
	
	
	System.out.println( book0.information() );
	System.out.println( book.information() );
	System.out.println("===============================");
	
	System.out.println( "수정된 결과 확인" );
	System.out.println( book1.information() );
	System.out.println("===============================");
	
		
	}
}
