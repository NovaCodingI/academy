package chapter03;

import java.util.Scanner;

public class chapter03Ex09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요");
		String one = scanner.next();
		System.out.println("두 번째 수를 입력하세요");
		String two = scanner.next();		
		
		if(Double.parseDouble(two) == 0.0 ) {
			System.out.println("결과 : 무한대");
		}
		
		System.out.println("첫 번째 수:" + Double.parseDouble(one));
		System.out.println("두 번째 수:" + Double.parseDouble(two));
		
		double result = Double.parseDouble(one) / Double.parseDouble(two);
		
		System.out.println("결과 : " + result);
		
		
		
	}
}