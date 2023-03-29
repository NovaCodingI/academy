package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열
		// 같은 타입의 데이터를 연속된 공간에 나열하고
		// index를 부여한 자료구조
		// ※ 같은 타입만 저장이 가능
		// ※ 한번 생성된 배열의 길이를 늘이거나 줄일 수 없다.
		// ※ 배열의 길이를 확인하는 방법 : 변수명.length
		// 			 = 항목의 갯수
		// 배열은 방번호 부터 시작하기때문에 조심해라..
		
		// 배열의 선언 : 타입[] 값 = {값의 목록} or 타입 값[] 
		// int score[];
		// 배열 선언과 동시에 값을 입력
		 int[] score = {90, 80, 60, 85, 50, 60, 70, 55, 99, 80};
		 			//  [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		 
		 
		 // 배열의 값을 참조 하는 방법
		 // 변수이름[index]
//		 System.out.println("score[0] = " + score[0]); // 90
//		 System.out.println("score[8] = " + score[8]); // 99
		 // 배열의 길이를 반환 : 변수이름.length - ()가 붙어있으면 메소드 .없으면 필드 -> .length는 필드다.
		 int j = score.length;
		 System.out.println("배열의 길이 : " + j);
		 // i = 0 ~ 9 
		 int sum = 0;
//		 for(int i=0;i<10;i++) {
		 // 배열의 길이를 반환
		 for(int i=0;i<score.length;i++) {
			 sum += score[i];
			 System.out.println(score[i]);
		 }
		System.out.println("점수 총 합계 : " + sum);
		System.out.println("평균 : " + sum/score.length);
	}
	
}
