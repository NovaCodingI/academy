package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 변수선언 : 변수타입 변수명
		// 자동 완성시 자동으로 import, 오류가 발생시 클릭하여 처리 할수 있음
		
//		Scanner scan;
//		scan = new Scanner(System.in);
		// 객체를 생성하는 방법
		// new 연산자는 객체를 메모리에 생성 후 메모리의 주소 반환 합니다
		// 클래스명 변수명 = new 클래스명(System.in);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요");
		//한줄을 읽어 옵니다.
//		String input = scan.nextLine();
		// 공백으로 구분해서 하나씩 읽어옵니다.
		String input = scan.next();
		System.out.println(input);
		System.out.println(Integer.parseInt(input)*10);
	
		// 숫자로받아옵니다.
		int i = scan.nextInt();
		System.out.println(i*i);
//		scan.nextInt(); // 숫자타입만 입력하는것
	
//		System.out.println(scan.nextInt()+1); // space 이후 출력안됌
		
		
	
	}

}
