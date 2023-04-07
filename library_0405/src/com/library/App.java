package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 라이브러리 생성
//		Library lib = new Library();
		Library lib = new Library("DB");
		// app 을 생성하지 않고 getString, getInt() 메소드를 사용할 수 없다.
		// main 메소드는 static 메소드 정적메소드
		// 정적필드에서는 인스턴스 필드를 사용할 수 없다.
		// 생성하고 사용해야 합니다.
		// 또는 getString(), getInt()를 정적 멤버로 만들어 줍니다.
		App app = new App();
		while(true) {  // ******* 로그인 반복 시작
		// 로그인
		// id를 입력 받아서 admin이면 관리자 아니면 사용자
		System.out.println("ID : ");

		// 자주 사용하는 로직은 메소드로 빼서 만들면 코드가 간결해집니다.
		// 스캐너로 부터 입력을 받아서 리턴해주는 역할
		String id = getString(); // static은 문자가 기울임꼴로 나온다.
			
//		if(id.equalsIgnoreCase("q")) {                   //getString()에서 하는 내용 메소드화 함
//			System.out.println("프로그램을 종료 합니다.");
//			System.exit(0);
//		}
		
		if(id.equalsIgnoreCase("admin")) {
			System.out.println("관리자 메뉴 입니다.");
				outter:
				while(true) {  // ******* 관리자 반복시작
				System.out.println("1. 도서등록 | 2. 도서삭제 | 0. 로그아웃 | q. 종료");
				System.out.println("메뉴를 입력해주세요.");
				// 메뉴를 입력 받습니다.
				int menu = getInt();
				int no = 0;
				switch (menu) {
				case 1:
					// 일련번호
					System.out.println(lib.toString());
					System.out.println("일련번호를 입력해주세요");
					no = getInt();
					// 도서명
					System.out.println("책 제목을 입력해주세요");
					String title = getString();
					// 작가
					System.out.println("작가 이름을 입력해주세요");
					String author = getString();
					
					lib.insertBook(no, title, author, false);
					System.out.println("도서가 등록 되었습니다.");
					break;
	
				case 2:
					System.out.println(lib.toString());
					System.out.println("삭제할 일련번호를 입력해주세요.");
					no = getInt();
					lib.deleteBook(no);
					System.out.println("도서가 삭제 되었습니다.");
				
					break;
					
				case 0:
					System.out.println("로그아웃 되었습니다.");
					break outter;
					
					
				default:
					System.err.println(menu +" 는 없는 메뉴 입니다.");
					break;
				}
			} // ******** 관리자 반복 끝
			
		} else {
			System.out.println(id + " 님 환영합니다.");
			
			//사용자 메뉴 반복
			userOutter:
			while(true) { //>>>>>>>>>> id 반복 시작
			System.out.println("메뉴를 입력해주세요.");
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
				System.out.println("반납 하고자 하는 책의 일련번호를 입력해주세요.");
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
			} // >>>>>>>> id 반복 끝
		} 
		
	} // ********* 로그인 반복 끝
}
		// 어드민 - 책 등록, 책 삭제
		// 사용자 - 책 대여, 책 반납
		
		
		// 책 추가
//		lib.insertBook(1, "혼자하는", "자바", false);
//		lib.insertBook(2, "둘이하는", "잡아", false);
//		System.out.println(lib); ==> lib.toString();
//		System.out.println(lib.toString());
//		System.out.println(lib.toString());
		
		// 책 삭제
//		int no = 0;
//		boolean res = lib.deleteBook(2);
		
//		res = lib.rentBook(1);
//		res = lib.returnBook(1);
		
	
	/**
	 * 사용자로부터 입력받은 문자열을 반환 합니다.
	 * - 숫자가 입력될 경우 다시 입력을 요청
	 * - Q,q가 입력될 경우 프로그램 종료
	 * @return
	 */
	public static String getString() {
		String str = "";
		while(true) {
			try {
				str = scan.next();
				// Q, q 입력되었으면 프로그램 종료
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				// 숫자로 변환시 숫자로 변경되면 문자를 입력해달라고 다시요청
				Integer.parseInt( str );
				System.err.println("문자를 입력해주세요");
			} catch (Exception e) {
				// 문자가 입력된 경우 문자를 반복문 탈출
				break;
			}	
		}
		return str;
	}
	
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다.
	 * - 문자가 입력되었을 경우 다시 입력 받습니다.
	 * - Q, q가 입력 되었을 경우 프로그램을 종료 합니다.
	 * @return
	 */
	public static int getInt() {
		int i = 0;
		String str = "";
		while(true) {
			
			try {
				// 사용자 입력 받기
				str = scan.next();
				// Q인지 확인하기
				if("q".equalsIgnoreCase(str)) {
					System.out.println("프로그램 종료 합니다.");
					System.exit(0);
				}
				// 숫자로 변환하기
				i = Integer.parseInt(str);
				break;
				
			} catch (Exception e) {
				// 오류가 발생시 다시 사용자 입력으로
				System.out.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
}

//		FileDao dao = new FileDao(); //
//		List<Book> list = dao.getList();
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}
//		FileDao dao = new FileDao();
//		List<Book> list = new ArrayList<>();
//		list.add(new Book(1, "제목1", "작가1", false));
//		dao.listToFile(list);