package member.service;

import java.util.Scanner;

public class MemberService {
	
	String id;
	String password;
	
	public boolean login() {
		
		
		while(true){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		id = scan.nextLine();
		System.out.println("패스워드를 입력하세요.");
		password = scan.nextLine();
		
		
		if(id.equals("hong") && password.equals("12345")) {
			System.out.println("로그인이 완료되었습니다.");
		} else {
			System.out.println("없는 아이디 입니다.");
		}
		
//		if(password.equals("12345")) {
			
			
//		} else {
//			break;
//		}
//		}
//		return true;
		
		
//	public void logout() {
		
//		System.out.println("로그아웃 되었습니다.");
//		return false;
//	}
		
		
	

	}
		
		
}
	
}
