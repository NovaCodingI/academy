package arrayEx;

public class ArrayIndexOutOfBoundsEx {
	
	public static void main(String[] args) {
		// 배열 선언
		int[] score;
		// 배열을 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생
//		score = {10, 20, 30}; <-- 오류 발생
		// ※배열 선언 후 생성하는 방법 : 1. new 연산자를 이용한다
		// 변수명 = new 타입[] {값 목록, ..., ...};
		score = new int[] {10, 20, 30};
		
		// ※배열 선언 후 생성하는 방법 : 2. 값의 목록이 없지만 미리 배열을 만드는 경우
		// 힙이라는 공간에 인트값을 저장 할 수 있는 공간이 n 개가 만들어짐 ex)score = new int[10]; 10개 만들어짐
		// 타입[] 변수 = new 타입[길이]
		score = new int[10];
		System.out.println("int을 저장할 10개의 공간을 만들었어요!");
		int count = 0;
		int sum = 0;
		// for문 초기화식;조건식;증감식
		for(int i=0;i<score.length;i++) {
			count++;			
			System.out.println("스코어 i " + score[i] + "카운터 : "+count);
			sum += i;
			System.out.println(sum);
		}
		
		
//		int sum += score[3]; // sum 이 초기화가 안되서 더하기가 안됌
		
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		// Index 3 out of bounds for length 3
		// 배열의 index는 0부터 시작한다
		// 배열의 총길이는 갯수를 반환 한다. 1부터.. 시작;;
		// 배열의 index를 초과하는 방번호가 입력된 경우
//		int sum = score[3]; <-- 오류발생
		
	}

}
