package forEx;

import java.util.Scanner;

public class Ex04_0701 {
	
	public static void main(String[] args) {
		
		// 예금 , 출금 , 잔고 , 종료 완성하시오 switch문으로
		
		
		
		int money = 0;
		out:
		
		while(true) {
		System.out.println("====================");
		System.out.println("버튼을 눌러주세요");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("====================");
		System.out.print("선택> ");
		
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		
		switch(num) {
		
		case 1 :
			
			System.out.println("입금할 액수를 입력해주세요");
			System.out.println("예금> : " );
			money += Integer.parseInt(scanner.nextLine());
//			money += num; // 1씩 더해지기만함..
			System.out.println("총 예금한 금액 : " + money);
			
			break;
			
		case 2 : 
			System.out.println("==잔액 :" + money);
			System.out.println("출금할 액수를 입력해주세요");
			System.out.println("출금> : " );
			
			num = Integer.parseInt(scanner.nextLine());
			
			if (money<num) {
				System.out.println("잔액부족입니다.");
			} else {
				money -= num;
				System.out.println("출금한 금액 : " + money);
			}
			break;
		
		case 3 : 
			
			System.out.println("현재 잔고는");
			System.out.println(money+"원");
			System.out.println("입니다");
			break;
		
		case 4 : 
			
			break out;
		
		 }
		
		System.out.println();
//		scanner.close();
		
		}
		System.out.println("프로그램 종료");
		
		
	}

}
