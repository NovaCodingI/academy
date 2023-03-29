package com.jungang;

public class VariableEx {

	public static void main(String[] args) {
		// 변수의 선언과 초기화
		// int : 정수를 저장
		// double : 실수를 저장
		// 정수형 변수 value를 선언
		int value;
		
		// 코드를 실행하는 중에 발생하는 오류를 '컴파일 오류'라고 함 (value 값 설정 안했을때)
		// 변수를 선언하고 초기화 하지 않은 경우 오류 발생
		//int res = value +10;
		
		// value 에 10(값)을 넣는 순간 초기화
		// 변수 초기화 -> 메모리에 변수가 생성되었다
		value = 10;
		int res = value + 10;
		
		// ln은 new line의 약자
		System.out.println("결과를 줄력 합니다.");
		System.out.println(res);
		System.out.println("감사합니다");
		
		// 타입 변수명 = 값;
		int weight = 60;
		// 키를 미터로 받아야 함 -> 실수 타입으로 선언!(int -> double)
		// 160 -> 1.6
		double height = 1.6;
		double bmi = weight/(height*height);
		
		// +연산자가 숫자끼리 나오면 연산
		// +연산자가 문자열과 함께 나오면 연결
		System.out.println(10+10);
		System.out.println("당신의 BMI는" + bmi + "입니다.");
		
		
		int weights = 70;
		double heights = 1.75;
		double bmis = weights / (heights*heights);
		System.out.println("당신의 BMI는" + bmis + "로 나왔습니다.");
				
		
		int hour = 5;
		int minute = 30;
		System.out.println(hour + "시간" + minute + "분");
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
	}

}
