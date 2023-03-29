package arrayEx;

public class ArrayEx2 {
	
	public static void main(String[] args) {
		// 배열을 생성
		
//		int[] score = {90, 5, 10}
		
		// 선언만해선 메모리에 안올라감 값을 입력해주어야 메모리에 들어간다
		
		String[] names = {"홍길동", "김기덕", "나자바"};
		
		// 기본타입의 변수는 i. 을 찍어도 아무것도 나오지않음
		// 참조타입은 객체라고 생각하면 된다. 그 객체가 가지고 있는 메소드, 필드를 반환해줄 수 있는
		// 실행할 수 있는 목록을 보여준다.
//		int i=0;
//		i.
		
		// 반복문을 이용해서 배열에 입력된 값을 출력
		// for문 초기화;조건식;증감식
		// 변수명.length : 배열의 값의 갯수
		for(int i=0;i<names.length;i++) {
			// 배열의 값에 접근 : 변수이름[방번호]
			System.out.println(names[i]);
		}
	
	}

}
