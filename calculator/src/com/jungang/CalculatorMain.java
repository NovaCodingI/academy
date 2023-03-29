package com.jungang;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		
		// 객체를 메모리에 올리는 것을 해야하는데 new
		// Calculator 객체를 생성 후 주소값을 반환
		// 타입 변수이름 = new class
		
		Calculator calc = new Calculator();
		
		System.out.println("=============");
		
		System.out.println(calc.name);
		calc.name = "실수계산기";
		// 필드에 있는 값을 변경할수도있다.
		
		System.out.println("calc.name : " + calc.name);
		
		// . : 주소접근연산자 -> 필드나 메소드를 확인
		// 메소드 위에 마우스커서를 올리면 설명이 나옴 // 반환타입도 알수있음
		// 메소드 만들땐 타입을 정해주고 넣을땐 값만 입력해주면 된다.
		
		System.out.println(calc.add(5, 7));
		calc.add(5, 7);
		
		// 재사용할때에는 변수에 담아줍니다
		int addRes = calc.add(5, 7);
		
		System.out.println(addRes);
		
	}

}
