package com.objectEx;

/**
 * 	1. API(Application Programming Interface)
 *  	-API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든
 *  		인터페이스를 뜻한다.
 *  
 *  	- 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
 *  		(라이브러리라고 부르기도 한다.)
 * 
 * @author user
 *
 */

public class ObjectEx {
	
	public static void main(String[] args) {
		String str = ""; // => Object
		print(str); // static이라고 선언했기때문에 생성하지 않고 사용할수있다. 매개변수를 넣어서 출력해보자
		System.out.println("==================");
		// int 타입은 기본타입 이므로 Object 타입으로 변환 되지 못합니다.
		// int 타입을 객체형태로 변환 해야 합니다.
		// ==> Wrapper 클래스인 Integer 타입으로 자동형변환 되어져서 들어간다 
		int num = 0;
		// int -> Integer (자동형변환) => Object
		// double -> Double
//		num. // 기본타입 : 값 자체를 저장
		// (.) : 주소접근연산자 , 접근이 안되면 기본타입이다.
		// 참조타입 : 주소를 저장한다
		
		
		print(num);
		System.out.println("==================");
		ObjectEx objEx = new ObjectEx();
		print(objEx);
//		objEx.
		str.toString();
		Integer.toString(0);
	}
	
	// 참조타입의 최상위 계층 Object
	// 부모타입으로 자동 형변환
	public static void print(Object obj) {
		// Object 클래스에 toString이 정의 되어 있지만
		// 메소드의 오버라이딩에 의해서
		// String 클래스, Integer 클래스에 정의되어 있는 메소드가 호출된다
		
		// obj.toString() F3을 통해 확인 클래스이름@16진수주소값을 반환
		System.out.println(obj.toString());
		
		// 두 객체가 가지고 있는 주소값이 같은지 비교
		// 주소가 같으면 true, 다르면 false
		obj.equals(new Object());
		
	}

}
