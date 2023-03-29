package copyTry;

import java.util.Scanner;

public class MeberService {

	String id;
	String pw;
	
	public boolean login() {
		
		
		while(true) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		id = scan.nextLine();
		System.out.println("패스워드를 입력하세요");
		pw = scan.nextLine();
		
		if(id.equals("hong") && pw.equals("12345")) {
			System.out.println("로그인이 되었습니다");
		} else {
			System.out.println("없는 아이디 입니다");
		}
					
			
			
			
			
			
			
			
		}
		
			
		
		
		
		
		
	}
	
}
