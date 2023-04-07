package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App { // class App 시작
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) { // class App main 끝
	Library lib = new Library();
	
	App app = new App();
	
	
	while(true) {
		
		System.out.println("ID : ");
		
		String id = getString();
		
		if(id.equalsIgnoreCase("admin")) {
			System.out.println("관리자 메뉴 입니다.");
			
			outter:
			while(true) {
				System.out.println("1. 도서등록 | 2. 도서삭제 | 0. 로그아웃 | q. 종료");
				System.out.println("메뉴를 입력해주세요.");
				
				int menu = getInt();
				int no = 0;
				switch (menu) {
				case 1:
					System.out.println(lib.toString());
					System.out.println("일련번호를 입력해주세요");
					no = getInt();
					System.out.println("책 제목을 입력해주세요");
					String title = getString();
					System.out.println("작가 이름을 입력해주세요");
					String author = getString();
					
					lib.insertBook(no, title, author, false);
					System.out.println("도서가 등록 되었습니다.");
					
					break;
					
				case 2:
					System.out.println(lib.toString());
					System.out.println("삭제할 일련번호를 입력해주세요");
					no = getInt();
					lib.deleteBook(no);
					System.out.println("도서가 삭제 되었습니다.");
					break;
					
				case 0:
					System.out.println("로그아웃 되었습니다.");
					break outter;
					
				default:
					System.err.println(menu + " 는 없는 메뉴 입니다.");
					break;
				}
			}
		} else {
			System.out.println(id + " 님 환영합니다.");
			
		userOutter:
		while(true) {
			System.out.println("메뉴를 입력해주세요");
			System.out.println("1. 도서대여 | 2. 도서반납 | 0. 로그아웃 | q. 종료");
			int menu = getInt();
			int no = 0;
			switch (menu) {
			case 1:
				System.out.println(lib.toString());
				System.out.println("대여 하고자 하는 책의 일련번호를 입력해주세요.");
				no = getInt();
				lib.rentBook(no);
				break;
				
			case 2:
				System.out.println(lib.toString());
				System.out.println("반납 하고자 하는 책의 일련번호를 입력해주세요");
				no = getInt();
				lib.returnBook(no);
				break;
				
			case 0:
				System.out.println("로그아웃 되었습니다.");
				break userOutter;
				
				
			default:
				System.err.println(menu + " 는 없는 메뉴 입니다.");
				break;
			}
			}
		}
	}
		
} // class App main 끝
	
	public static int getInt() {
		int i = 0;
		String str = "";
		while(true) {
			
			try {
				str = scan.next();
				if("q".equalsIgnoreCase(str)) {
					System.out.println("프로그램 종료 합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
				
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
	
	public static String getString() {
		String str = "";
		while(true) {
			try {
				str = scan.next();
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				Integer.parseInt(str);
				System.err.println("문자를 입력해주세요");
			} catch (Exception e) {
				break;
			}
		}
		return str;
	}
	
	
	
	
} // class App 끝
	
	

