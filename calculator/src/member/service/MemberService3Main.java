package member.service;

import java.util.Scanner;

public class MemberService3Main {
	
	public static void main(String[] args) {
		
		MemberService3 service = new MemberService3("홍길동", "1234");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 사용자로부터 id/pw를 입력 받는다
			System.out.print("id : ");
			String id = scan.next();
			System.out.print("pw : ");
			String pw = scan.next();
			//===========================
			
//		boolean res = service.login("홍길동", "1234");
			boolean res = service.login(id, pw);
			
			if(res) {
				System.out.println("환영합니다.");
				break;
			} else {
				System.out.println("id/pw가 일치하지 않습니다.");
			}
		
		}
		
		while(true) {
		System.out.println("로그아웃을 하시려면 q를 입력해주세요");
		String exit = scan.next();
		if("q".equals(exit)) {
			System.exit(0);
		}
	
		}
		
		
	}

}
