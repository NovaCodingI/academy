package arrayEx;

import java.util.Scanner;

public class ArrayEx3 {
	
	public static void main(String[] args) {
		// new 연산자로 배열을 생성하는 방법
		// String 타입의 배열을 만들어주세요 총길이는 10으로 생성!
		// String[] names = new String[10];
		
		String[] names = {"홍홍홍", "훙훙훙"};
		int[] score;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 방을 만들까요?");
		int index = scan.nextInt();
		score = new int[index];
		for(int i=0;i<score.length;i++) {
			int[] y = score;
			System.out.println("몇개 만들어졌게" + y);
		}
		
		
		
		names[0] = "홍길동";
		names[1] = "ㅎㅎㅎ";
		
		for(int i = 0;i<names.length;i++) {
		
			System.out.println(names[i]);
		
		}
		
		// 타입[] 변수명 = new 타입[길이]; 길이 = 변수명.length
		// 타입에 맞게 기본값으로 초기화 되어 값이 입력된다
		// int 정수 : 0, double 실수 : 0,0, booleadn : false, 참조(객체) : null
		// 배열의 방길이는 변하지 않는다!! 줄이거나 늘일 수 없다.
		
		
	}

}
