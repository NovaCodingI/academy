package chapter02;

import java.util.Scanner;

public class chapter02Ex03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("[필수 정보 입력]");
		
//		System.out.println("이름을 입력해주세요");
//		String i = scanner.nextLine();
//		System.out.println("1. 이름 : " + i);
//		System.out.println("주민번호 앞 자리 6자리를 입력해주세요");
//		String j = scanner.nextLine();
//		System.out.println("2. 주민번호 앞 자리 6자리 : " + j);
//		System.out.println("전화번호를 입력해주세요 000-000-0000");
//		String k = scanner.nextLine();
//		System.out.println("3. 전화번호 : " + k);
		
//		String i = scanner.nextLine();
//		String j = scanner.nextLine();
//		String k = scanner.nextLine();
//		System.out.println("1. 이름 : " + i);
//		System.out.println("2. 주민번호 앞 자리 6자리 : " + j);
//		System.out.println("3. 전화번호 : " + k);
		
		
//		System.out.println("1. 이름 : " + i);
//		String i = scanner.nextLine();
//		System.out.println("2. 주민번호 앞 자리 6자리 : " + j);
//		String j = scanner.nextLine();
//		System.out.println("3. 전화번호 : " + k);
//		String k = scanner.nextLine();
		
		String i = scanner.nextLine();
		String j = scanner.nextLine();
		String k = scanner.nextLine();
		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름 : " + i);
		System.out.println("2. 주민번호 앞 자리 6자리 : " + j);
		System.out.println("3. 전화번호 : " + k);
		
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
