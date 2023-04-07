package forEx;

import java.util.Scanner;

public class Ex0404 {

	public static void main(String[] args) {
		
		// 입력을 받기위해 스캐너 객체를 생성합니다.
		Scanner scan = new Scanner(System.in);
		
		int money = 0;
		// 라벨(이름) 을 붙여줍니다.
		out:
			
		while(true) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.println("선택> ");
		
			//scanner.next(); // 사용자의 입력을 문자열로 반환
			int input = scan.nextInt();	// 사용자의 입력을 숫자로 반환
			// switch (변수){
			// 		case 변수의 값 : 
			// }
			// 1. case문 완성 시키기
			// 2. 반복해서 실행하기
			
			
			switch (input) {
				//input == 1
				case 1:
					 // 예금
					 // 변수의 값이 1이면 실행
					 // 코드 작성
					 System.out.println("예금액> ");
					 money += Integer.parseInt(scan.next());
					 System.out.println("현재 잔고는 " + money + "입니다.");
//					 money += scan.nextInt();
//					 System.out.println("사용자 입력값: " + money);
					 // break문이 없으면 다음 case 를 계속해서 실행 합니다.
					 // 반복문, switch 문을 빠져 나갑니다.
					 break;
	
					//input이 2이면 실행합니다.
				case 2:
					// 출금
					System.out.println("==잔액 :" + money);
					System.out.println("출금액> ");
					int num = scan.nextInt();
					if (money<num) {
						System.out.println("금액이 부족합니다.");
					} else {
						money -= num; // money = money - num
					}
					break;
					
					//input이 3이면 실행합니다.
				case 3:
					//잔고
					System.out.println("잔고> " + money);
					break;
					
					//input이 4이면 실행합니다.
				case 4:
					//종료
//					System.exit(0);
					break out; // out 까지 빠져 나가
					
			}
			System.out.println("money : " + money);
			
		} // while 종료
		System.out.println("프로그램 종료");
	}
}

//			if(input == 1) {
//				//예금
//			} else if (input == 2){
//				
//			}
//			