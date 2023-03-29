package scanner;

import java.util.Scanner;

public class Bmi2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {

		System.out.println("키를 입력하세요 : ");
		double height = scan.nextDouble();
		System.out.printf("당신의 키는 %.1f는 입니다", height);
		System.out.println();
		
				
		System.out.println("몸무게를 입력하세요 :");
		double weight = scan.nextDouble();
		System.out.printf("당신의 몸무게는 %.1f 입니다.", weight);
		System.out.println();
		
		double bmi = weight / (height*height);
		
		System.out.printf("당신의 BMI는 %.3f 입니다.", bmi);
				
		//double dheight = Double.parseDouble(height); 이건 String 변환
		
		
	   }
    }

}