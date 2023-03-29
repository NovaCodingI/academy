package com.jungang;

public class Calculator {
	
	// main 메소드 가 없으면 실행 자체가 안된다.
	// 필드 혹은 전역변수 -> 필드도 자동으로 초기화 된다.
	String name;  // 원래는 접근제한자를 붙여줘야한다. 붙이지 않는다면 default
//	private String name;
	// class 내부에만 사용하고 싶다면 private 사용하면 된다 "캡슐화" 외부로부터 내부 클래스를 보호할수있다. private String name;
	
	// 생성자의 특징 2가지
	// 1. 클래스의 이름과 동일한 이름을 가지고 있다
	// 2. 반환타입이 없다
	// 생성자 : new 연산자를 만나서 객체가 생성될때 실행됩니다.
	public Calculator() {
		// 생성자는 초기화를 한다!
		name = "정수계산기";
//		System.out.println("Calculator() 생성자를 실행합니다.");
		System.out.println(name);
	}
	
	// 접근제한자 반환타입 메소드명 (매개변수타입 변수명 {}
	// 정수의 합계를 구하는 메소드 두 수를 입력받아 두 수의 합을 반환
	
	/**
	 * 두개의 정수를 입력받아 두수의 합을 반환 합니다.
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	
	public int add(int num1, int num2) {
		
		return num1+num2;
		

}
}
