package forEx;

import java.util.Scanner;

public class Ex04_0702 {
	
	public static void main(String[] args) {
		
		// 예금 , 출금 , 잔고 , 종료 프로그램 작성
		
		
		int money = 0;
		
		Out:
		
		while(true) {
			
			System.out.println("=======하고자 하는 업무, 숫자를 입력해주세요.=========");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("===========================================");
			System.out.println("선택> : ");
			
			Scanner scan = new Scanner(System.in);
			int num = Integer.parseInt(scan.nextLine());
		
		
		switch (num) {
		
		case 1: 
				System.out.println("예금하실 액수를 적어주세요");
		        money += Integer.parseInt(scan.nextLine());
		        System.out.println("입력하신 금액은 : " + money + " 입니다.");
		        break;
			
		case 2 : System.out.println("출금하실 액수를 적어주세요");
				 System.out.println();
				 
				 num = Integer.parseInt(scan.nextLine());;
				 
				 if(money<num) {
					 System.out.println("잔액이 부족합니다");
				 } else {
					money -= num;
//					money = -num; 조심해라.. 또 틀리지말고 ㅠㅠ 제발;;
							System.out.println(money + "가 출금 되었습니다.");
				 }
			break;
			
		case 3: System.out.println(" 현재 잔액은 " + money + " 입니다 ");
			
			break;
			
		case 4:
			
			break Out;
		
		}
		System.out.println();
		
	}
		System.out.println("시스템이 종료 되었습니다");

}
}

