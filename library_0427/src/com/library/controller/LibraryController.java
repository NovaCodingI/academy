package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.RentService;
import com.library.vo.Member;

/**
 * 도서대여 시스템
 * 
 * ▶ 사용자로부터 입력을 받아서
 * 		사용자요청에 알맞는 서비스로직을 호출 합니다.
 * 
 * ▶ 로그인
 * 	- 관리자
 * 		메뉴	: 도서등록, 도서삭제, 사용자등록, 사용자삭제
 * 	- 사용자
 * 		메뉴 : 도서대여, 도서반납, 도서대여현황
 * 
 * @author user
 *
 */
public class LibraryController {
	
	Scanner scan = new Scanner(System.in);
	
	// 서비스 멤버로 등록
	MemberService memberService = new MemberService();
	BookService bookService = new BookService(); // 북서비스 사용안함!! 렌트서비스로 교체!
	RentService rentService = new RentService(); // 기존에 북서비스 바꾸면 됌!!
	
	/**
	 * 도서관리 시스템 시작
	 */
	public void library() {
		System.out.println("===================");
		System.out.println("==도서관리시스템 v1.0==");
		System.out.println("===================");
		
		while(true) {
			// 로그인
			Member member = login();
			
			if(member.getAdminYN().equalsIgnoreCase("Y")) {
				// 관리자 메뉴 실행
				adminMenu();
			} else {
				// 사용자 메뉴 실행
				userMenu();
			}
		}
	}
	/**
	 * 사용자 메뉴
	 */
	private void userMenu() {
		
		
		while(true) {
			
			// 책 목록 출력
			bookService.getList();
			System.out.println("=== 사용자 메뉴 ===");
			System.out.println("1. 도서대여 | 2. 도서반납 | 0.로그아웃 | Q. 종료");
			System.out.println("================");
			System.out.println("메뉴를 입력해주세요");
			// 종료는 따로 switch문에 안만들어도 됌
			
			int bookNo = 0;
			String id = "";
			int menu = getInt();
			switch (menu) {
			case 1:
				// 도서대여
				bookService.getList();
				System.out.println("대여할 도서 번호를 입력해주세요");
				bookNo = getInt();
				rentService.rentBook(bookNo, id);
				//bookService.rentBook(bookNo); // 렌트서비스가 생겨서 주석처리했음!!
				System.out.println("도서대여가 완료 되었습니다.");
				break;

			case 2:
				// 도서반납
				bookService.getList();
				System.out.println("반납할 도서 번호를 입력해주세요");
				bookNo = getInt();
				rentService.returnBook(bookNo);
				//bookService.returnBook(bookNo); // 렌트서비스가 생겨서 주석처리했음!!
				System.out.println("도서반납이 완료 되었습니다");
				break;
				
			case 0:
				// 로그아웃
				return;
			default:
				System.err.println("메뉴를 확인후 다시 입력해주세요");
				break;
			}
			
		}
		
	}
	
	/**
	 * 관리자 메뉴
	 */
	private void adminMenu() {
		
		while(true) {
			
			// 도서 목록을 출력
			bookService.getList();
			
			System.out.println("=== 관리자 메뉴 ===");
			// 너무 길어지면 중간에 엔터치면 + 로 이어준다 자동완성
			System.out.println("1. 도서등록 | 2. 도서삭제 |"
					+ " 3. 사용자등록 |"
					+ " 4. 사용자삭제 | 0. 로그아웃 | Q. 종료");
			System.out.println("================");
			System.out.println("메뉴를 선택 해주세요");
			// 숫자를 받아와요!! 그리고 변수에 저장해주세요
			int menu = getInt();
			// 읽은 값을 switch(menu)를 통해 데이터를 출력한다.
			
			String id = "";
			String pw = "";
			String name = "";
			String str = "";
			switch (menu) {
			case 1:
				// 도서등록
				// 사용자로 부터 입력 받기 - 도서명, 작가명 / rentYN을 안하는이유는 기본값이 있기때문 (BookDao insert 확인)
				// Controller -> service -> dao -> data 처리!!
				// 컨트롤러에서 사용자 입력을 받은 후 서비스에서 책객체를 생성해서 매개변수로 넣어주면 된다.
				String title, author;
				System.out.println("도서등록을 하려면 도서명과 작가명을 순차적으로 입력해주세요");
				System.out.println("도서명을 입력해주세요");
				title = getString();
				System.out.println("작가명을 입력해주세요");
				author = getString();
				
				bookService.insert(title, author);
				System.out.println(title + "의 도서등록이 완료되었습니다.");
				break;
				
			case 2:
				
				// 도서삭제
				System.out.println("도서삭제를 원하시면 도서번호를 입력해주세요");
				// getInt(); //변수에 담아줘요~!
				int no = getInt();
				bookService.delete(no);
				System.out.println("도서가 삭제되었습니다.");
				
				// bookService.delete(getInt()); 이렇게 해도 되나 오류를 찾기 어려움
				break;
				
			case 3:
				// 사용자 등록
				id = "";
				System.out.println("사용자를 등록하시려면 id와 pw를 순차적으로 입력해주세요");
				System.out.println("id를 입력해주세요");
				
				// 아이디 중복체크
				// 계속 입력? 반복가능!!
				while(true) {
					id = getString();
					boolean idcheck = memberService.idCheck(id);
					if(idcheck) {
						break;
					}
				}
				
//				id = getString();
				System.out.println("pw를 입력해주세요");
				pw = getString();
				System.out.println("이름을 입력해주세요");
				name = getString();
				System.out.println("관리자 계정이면 Y를 입력해주세요");
				str = getString();
				String adminYN = str.equalsIgnoreCase("Y")? "Y":"N";
				
				memberService.insert(id, pw, name, adminYN);
				System.out.println("사용자 등록이 완료되었습니다");
				break;
				
			case 4:
				// 사용자 삭제
				System.out.println("사용자를 삭제하시려면 id를 입력해주세요");
				id = getString();
				
				memberService.delete(id);
				System.out.println("사용자 삭제가 완료되었습니다");
				break;
				
			case 0:
				// 반복문 탈출 시켜주면된다. 로그아웃
				
				return; //반복문 탈출
				
			default:
				// 없는 메뉴 번호 입력
				System.out.println("메뉴를 확인후 다시 입력해주세요");
				break;
			}
		}
	}

	public Member login() {
		// 로그인
		while(true) {
			System.out.println("<로그인>");
			System.out.println("id를 입력해주세요");
			String id = getString();
			System.out.println("pw를 입력해주세요");
			String pw = getString();
			
			// 입력을 받아서 가서 반복해서 복잡해질것같아서..?? member 객체가 가지고있는걸 써야해서 null이 아니면 체크를해야함
			// 컨트롤러가 개입이 되어야하는 로직이있어서 서비스에서 안하고 컨트롤러에서 함!!
			// 서비스로직에 가도.. null 이 나오게되면 컨트롤러에서 중복체크를 하게 됨 그래서 컨트롤러에 생성
			Member member = memberService.login(id, pw);
			
			// 로그인 성공 - member 객체를 반환 ※ null 이 아니면!!
			if(member != null) {
				return member;
			}
		}
	}
		
		
	
	/**
	 * 사용자의 입력을 받아 문자열을 반환 합니다.
	 * 문자가 입력 될때까지 반복
	 * q,Q가 입력되면 종료
	 * @return
	 */
	private String getString(){
		String str = "";
		str = scan.next();
		
		while(true) {
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료!!");
				System.exit(0);
			}
			return str;
		}
	}

	/**
	 * 사용자의 입력을 받아 숫자를 반환 합니다.
	 * 숫자가 입력 될때까지 반복
	 * q,Q가 입력되면 종료
	 */
	private int getInt(){
		int i = 0;
		while(true) {
			try {
				i = scan.nextInt();
				return i;
			} catch (Exception e) {
				String str = scan.next();
				// q, Q 가 입력된 경우 정상종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				System.err.println(str + "은 입력 불가능 합니다.");
				System.err.println("숫자를 입력해주세요");
			}	
//			return i;
		}
	}
	 
}




