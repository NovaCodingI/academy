package com.StringEx;

public class StringEx2 {
	
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		// 매개값의 문자열을 포함 여부를 확인
		// 포함 : 시작 인덱스 값을 반환
		// 불포함 : -1 반환
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("C"));
		
		// substring과 함께 사용 될 수 있다
		System.out.println(str.substring( str.indexOf("프로") ));
		
		if(str.indexOf("자바") > 0) {
			System.out.println("자바 관련 있음");
		} else {
			System.out.println("자바와 관련 없음");
		}
		
		// 문자의 길이를 반환 합니다.
		// id의 길이는 5자 이상 이여야 합니다.
		String id = "id";
		if(id.length() < 5
				||id.length() > 14) {
			System.out.println("아이디는 5자 이상 14자 이하로 작성 가능합니다.");
		}
		
		String ssn = "1234567654321";
		if(ssn.length() != 13) {
			System.out.println("주민등록번호를 정확히 입력해주세요");
		}
		
		// 원하는 문자열 추출
		// 시작인덱스 포함, 끝인덱스 불포함
		System.out.println("주민등록번호 앞자리 : " + ssn.substring(0,6));
		System.out.println("주민등록번호 뒷자리 : " + ssn.substring(6)); // 시작인덱스만 넣어주면 끝까지 출력합니다.
		
		
		// 문자 교체
		str = "자바는 객체지향 언어입니다. 자바를 자바봅시다";
		str.replace("자바", "java");
		String newStr = str.replace("자바", "java"); 
		System.out.println(newStr);
		System.out.println(str.replace("자바", "java"));
		
		// 대소문자 교체
		str = "Java Programe Language";
		
		// 대문자로 변경
		System.out.println("대문자로 변경 : " +str.toUpperCase());
		// 소문자로 변경
		System.out.println("소문자로 변경 : " +str.toLowerCase());
		
		str = "q";
		// 대소문자를 가리지 않고 비교
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		System.out.println(str.equalsIgnoreCase("s"));
		
		// 공백을 제거해주기
		id = "       id    ";
		System.out.println(id);
		System.out.println(id.trim());
		
		// 기본타입을 문자로 변경
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf(true));
	}

}
