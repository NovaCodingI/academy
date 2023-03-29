package ex;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("첫번째수 : ");
		String strnum1 = scanner.nextLine();
		System.out.print("두번째수 : ");
		String strnum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		int result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
				
	}
}
