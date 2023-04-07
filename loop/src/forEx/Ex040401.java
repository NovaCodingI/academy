package forEx;

import java.util.Scanner;

public class Ex040401 {
	
	public static void main(String[] args) {
		
		// 예금, 출금, 잔금, 종료가 되게끔 진행한다.
		
		Scanner scan = new Scanner(System.in);
		int money = 0;
		out:
		while(true) {
			
			System.out.println("========안녕하세요 신한은행 입니다.===========");
			System.out.println("===========메뉴를 선택해주세요.===========");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔금 | 4. 종료");
			System.out.println("======================================");
			System.out.println("선택>");
			
			int bank = scan.nextInt(); 
			switch (bank) {
			case 1: 
				System.out.println("예금할 금액을 입력해주세요.");
				money += Integer.parseInt(scan.next());
				System.out.println(money + "원 이 입금 되었습니다.");
				break;
			case 2: 
				System.out.println("출금할 금액을 입력해주세요.");
				int num = scan.nextInt();
				if(money<num){
					System.out.println("잔액이 부족합니다. \n 금액을 확인해주세요.");
				} else {
					money -= num;
				}
				break;
				
			case 3:
				System.out.println("현재 잔액은 " + money + " 원 입니다.");
				break;
				
			case 4:
				break out;
			}
		}
		System.out.println("종료 되었습니다.");
	}
}
