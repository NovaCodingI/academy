package member.service;

import java.util.Scanner;

public class MemberServiceMain {

	public static void main(String[] args) {
		
//		 MemberService1 service = new MemberService1();
		 
//		 boolean res = service.login("홍길동", "12345");
//		 
////		 if(service.login("홍길동", "12345")) {
//		 if(res) {
//			 System.out.println("홍길동님 환영합니다~!");
//		 } else {
//			 System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
//		 }
//		
//		 service.logout("홍길동");
//		 
		
//		 MemberService service = new MemberService();
//		 
//		 service.login();
		
		MemberService2 service2 = new MemberService2("홍길동","12345");
//		MemberService4 service4 = new MemberService4("홍길동");
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		
		while(true) {
		
		System.out.println("아이디를 입력해주세요");
		String id =scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw =scan.next();
		
		 
		boolean res = service2.login(id, pw);
//		boolean res = service2.login("홍길동", "12345");
		
		if(res) {
			System.out.println(service2.id+"님 환영합니다");
			break;
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다");
			i++;
			if(i>=5) {
				System.out.println("시스템을 종료합니다.(비번불일치 5회 초과)");
				System.exit(0);
				
			}
		}
//		while(true) {
//			System.out.println("로그아웃하시려면 아이디를 입력해주세요");
//			String id =scan.next();
//			service2.logout();
//		}
	}
}

}