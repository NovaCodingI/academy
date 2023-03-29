package ex;

public class Ex03 {
	public static void main(String[] args) {
		
		// 오름차순 -> 작은수가 앞으로..
		//  5   3   4   2   1
		// [0] [1] [2] [3] [4]
//		{0,0,0,0,0,0} 로또
		int[] numbers = {5,3,4,2,1};
		// 배열의 중복 제거
		
		int lotteNum;
		
//		for(int num : numbers) {
//			if(num == lotteNum) {
//				
//			}
//		}
		
		
		
		
		
//		int[] numbers = {5,3,4,2,1};
		// 배열의 값을 정렬하고 싶어요!
		// 방을 바꾸기 위해 새로운 변수를 선언하고 이용합니다.
//		int temp = numbers[0];
		
		
		// 스트링의 인덱스도 0번부터 시작
		
		String str = "안녕하세요!!";
		String str1 = "abcde";
		
		str.charAt(0);
		System.out.println("char : " + (int)str.charAt(0));
		// 인덱스를 char 타입으로 반환해주는것. 출력 될때 유니코드로 발생됌
		System.out.println("char1 : " + str1.charAt(0));
		
		// 문자열 끊기
		str.length();
		
		System.out.println(str.length());
		str.substring(0,2);
		System.out.println(str.substring(0,2));
		str.substring(0,3);
		System.out.println(str.substring(2,5));
		// 시작인덱스, 끝인덱스
		// 시작인덱스는 포함, 끝 인덱스는 포함되지 않아요!
		System.out.println(str.substring(0,str.length()));
		
		
		
		
		
		
	}

}
