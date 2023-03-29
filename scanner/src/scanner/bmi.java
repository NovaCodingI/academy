package scanner;

import java.util.Scanner;

public class bmi {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키를 입력해주세요(단위 : m) : ");
		// 변수이름. : 사용가능한 메소드 목록을 제시
		String height = scan.next();
		System.out.printf("당신의 키는 %s 입니다.\n", height);
		
		// 몸무게를 입력해주세요 :
		// 몸무게를 입력 받고 출력
		
		System.out.println("몸무게를 입력해주세요(단위 : kg) : ");
		String weight = scan.next();
		System.out.printf("당신의 몸무게는 %s 입니다.\n", weight);
		System.out.println();		
		Double dHeight = Double.parseDouble(height);
		Double dWeight = Double.parseDouble(weight);
		
//		System.out.println("당신의 Bmi는 " + dWeight/(dHeight*dHeight) + " 입니다."); // 실수타입표현
		System.out.printf("당신의 Bmi는 %.2f 입니다. ", dWeight/(dHeight*dHeight));
		System.out.println();
		
		
		System.out.println("나이를 입력해주세요 : ");
		String age = scan.next();
		System.out.printf("당신의 나이는 %s 입니다.\n", age);
		
		
		
//		scan.close(); // scanner가 사용하고 있던 리소스를 반납
		
		
	}
}
