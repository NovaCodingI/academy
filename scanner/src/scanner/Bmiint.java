package scanner;

import java.util.Scanner;

public class Bmiint {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		while (true) {
		// 키를 입력 받는다
		// 몸무게를 입력받는다
		// bmi를 출력한다
		
		System.out.println("키를 입력 해주세요(단위:m) : ");
		double height = scan.nextDouble();
//		System.out.printf("당신의 키는 %f 입니다. ", height);
		
		System.out.println("몸무게를 입력 해주세요(단위:kg) :");
		double weight = scan.nextDouble();
//		System.out.printf("당신의 몸무게는 %f 입니다.", weight);
		
		double bmi = weight / (height*height);
		
		System.out.printf("당신의 BMI는 %.2f 입니다", bmi);
		System.out.println();
		
		if(bmi <= 18.5) {
			System.out.println("저체중입니다.");
		} else if(bmi <= 22.9) {
			System.out.println("정상입니다.");
		} else if(bmi <= 24.9) {
			System.out.println("과체중입니다.");
		} else  {
			System.out.println("비만입니다.");
		}
		
	}
		
		/*
		 * BMI가 18.5 이하면 저체중
		 * 18.5 ~ 22.9 사이면 정상
		 * 23.0 ~ 24.9 사이면 과체중
		 * 25.0 이상부터는 비만으로 판정.
		*/
		
//		scan.close();
				
	}

  }