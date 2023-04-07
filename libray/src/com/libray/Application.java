package com.libray;

import java.util.Scanner;

public class Application {

	// 인스턴트멤버 -> 생성 후 사용 할 수 있어요
	// 레퍼런스변수명으로 . 찍어서 사용 할 수 있어요
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		scan.next(); // main은 static // app.scan.next(); => 이래야 사용가능 // 인스턴트멤버는 생성 후 사용이 가능합니다.
		Application app = new Application();
		
		// 생성후 사용해야 합니다.
//		app.scan.next();
//		app.getInt();
//		app.getString();
		
		// 도서관 생성
		Libray lib = new Libray("file");
		System.out.println("실행");
		// 로그아웃 처리시 다시 실행
		while(true) {
			// 로그인 처리
			System.out.println("아이디를 입력해주세요.");
			String id = app.getString();
			
			if("admin".equalsIgnoreCase(id)) {
				outter:
				while(true) {
					// 관리자
					// 도서목록 출력
					lib.info();
					// 메뉴 확인
					System.out.println("1. 도서등록 | 2. 도서삭제 | 0. 로그아웃 | q. 프로그램종료");
					System.out.println("메뉴를 입력해주세요.");
					int menu = app.getInt();
					int no = 0;
					
					switch(menu) {
					case 1:
						// 도서등록
						System.out.println("일련번호를 입력해주세요");
						no = app.getInt();
						System.out.println("제목을 입력해주세요");
						String title = app.getString();
						System.out.println("작가를 입력해주세요");
						String author = app.getString();
						
						lib.insertBook(no, title, author, false);
						break;
						
					case 2:
						// 도서삭제
						System.out.println("삭제할 책의 일련번호를 입력해주세요");
						no = app.getInt();
						lib.deleteBook(no);
						
						break;
						
					case 0:
						// 로그아웃
						System.out.println("로그아웃 되었습니다.");
						break outter;
						
					default:
						System.err.println("메뉴를 확인 후 다시 입력 해주세요");
					}
				}
				
		} else {
			// 사용자 메뉴
			app.memberMenu(lib);
		}
	}
}
			
	private void adminMenu() {
		
		
	}
	
	private void memberMenu(Libray lib) {
		// 사용자
		// 메뉴별로 작업 수행
		while(true) {
			
			// 도서목록 출력;
			lib.info();
			
			// 메뉴 확인
			System.out.println("1. 도서대여 | 2. 도서반납 | q. 프로그램종료");
			System.out.println("메뉴를 입력 해주세요.");
			int menu = getInt();
			
			if(menu == 1) {
				System.out.println("도서번호를 입력 해주세요.");
				int index = getInt();
				lib.rentBook(index);
			} else if (menu == 2) {
				System.out.println("도서번호를 입력 해주세요.");
				int index = getInt();
				lib.returnBook(index);
			} else if(menu == 0) {
				break;
			}	else {
				System.err.println("메뉴를 확인해주세요");
			}
			
		}
	}
		
		
		
		

	

	/**
	 * 사용자로부터 숫자를 입력 받습니다.
	 * @return
	 */
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다");
					System.exit(0);
				}
				
				i = Integer.parseInt(str);
				
				break;
			} catch (Exception e) {
				System.err.println("입력중 오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
	
	/**
	 * 사용자로부터 문자를 입력 받습니다.
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			try {
				res = scan.next();
				
				// 숫자인 경우 다시 받아올 수 있도록
				try {
					// 숫자로 변환 합니다.
					Integer.parseInt(res);
					System.out.println("숫자는 입력할 수 없습니다.\n문자를 입력해주세요.");
					// 숫자로 변환 되면 입력을 다시 받아 올 수 있도록 합니다.
					continue;
				} catch (Exception e) {
				}
				
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다");
					System.exit(0);
				}
				
				break;
			} catch (Exception e) {
				System.err.println("입력중 오류가 발생 했습니다.");
				System.out.println("문자를 입력해주세요.");
			}
		}
		return res;
	}
}

//     ====================================== 메소드로 만들기 ====================================================			
//			// 사용자
//			// 메뉴별로 작업 수행
//			while(true) {
//				
//				// 도서목록 출력;
//				lib.info();
//				
//				// 메뉴 확인
//				System.out.println("1. 도서대여 | 2. 도서반납 | q. 프로그램종료");
//				System.out.println("메뉴를 입력 해주세요.");
//				int menu = app.getInt();
//				
//				
//				if(menu == 1) {
//					System.out.println("도서번호를 입력 해주세요.");
//					int index = app.getInt();
//					lib.rentBook(index);
//				} else if (menu == 2) {
//					System.out.println("도서번호를 입력 해주세요.");
//					int index = app.getInt();
//					lib.returnBook(index);
//				} else if(menu == 0) {
//					break;
//				}	else {
//					System.err.println("메뉴를 확인해주세요");
//				}
//				
//			}
//		}
//	}
//   ==================== private void memberMenu(Libray lib) { ============================

//		System.out.println("나이를 입력해주세요.");
//		System.out.println("나이 : " + app.getInt());
//		System.out.println("이름을 입력해주세요.");
//		System.out.println("이름 : " + app.getString());