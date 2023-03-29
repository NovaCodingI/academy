package com.kh.object.practice;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개(중복x) 출력
		
		// 0 <= random <1
		// 0 <= random < 45 (*45)
		// 1 <= random < 46 (+1)
		// 1 ~ 45
//		int num = (int)Math.random() * 45 + 1;

		// 6개의 수를 저장할 공간을 생성
		int[] lotto = new int[6];
		
		// i : 0 ~ 5
		for(int i=0;i<lotto.length; i++) {
			// 새로운 임의의 수를 생성하여 배열에 저장
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			// 중복체크
			// 기존에 동일한 숫자가 입력되었는지 체크
			// i=0 ;
			// j=0, 1, 2, 3, 4, 5
			// i<lotto.length;
			
			for(int j=0; j<i; j++) {
				// [0] == [0] i<lotto.length; 일때 오류
				// [-1] == [1] i<lotto.length;
				if(lotto[i] == lotto[j]) {
					//-1
					i--;
				}
			}
				
		}
		
		// 방을 바꿀때 필요한 저장공간을 생성
		int temp = 0;
		// 순서대로 정렬하기
		for(int i=0; i<lotto.length; i++) {
			// 오름차순 / 내림차순
			for(int j=i; j<lotto.length;j++) {	//오름차순
//				for(int j=0; j<lotto.length;j++) { // 내림차순
				if(lotto[i] > lotto[j]) {
					// 방바꾸기
					temp = lotto[i];
					// 작은수가 앞으로 올 수 있도록 자리바꿈
					lotto[i] = lotto[j];
					// 큰 수를 뒤로 이동
					lotto[j] = temp;
						
				}
				
			}
		}
		
		
		// 반복문을 활용하여 배열을 출력
		System.out.println("lotto Number");
		for(int num : lotto) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
	}

	public void outputChar (int num, char c) {
		// 전달받은 문자를 전달받은 숫자만큼 출력 (입력받은 숫자만큼 반복문을 실행)
		for(int i=0;i<num;i++) {
			System.out.print(c+" ");
		}
		System.out.println();
		
	}

	public char alphabette () {
		// 문자코드
		// A~Z=65~90, a~z=97~122
		// 91~96 번까지 제외하는 처리
		// 임의의 수를 생성
		// 숫자를 추출해서 char 타입으로 변환
		// 65 ~ 122
		// 1~122 ==> *122+1 (Math.random()*122+1)
		// 66~187 == > *122+65 (Math.random()*122+65)
		// *n을 했을때 랜덤의 범위
		// 0 ~ n -1
		// 0 <= random < 1
		// 범위 : 122 - 65 = 58 123인데 뒤에자리 -1 (Math.random()*58+65)
		
		int num = (int)(Math.random()*58+65);
		System.out.println((char)num);
		return (char)num;
		
		// while 문 이용 , if문으로 처리
		
		// 임의의 알파벳을 하나 리턴
//		System.out.println(num);
		
		
	}
	
	public String mySubstring (String str, int index1, int index2) {
		
		// str.   많은 메소드 들이 나온다.
		// 문자열의 인덱스 값을 이용하여 문자열을 추출
		// 시작인덱스는 포함하고 끝인덱스는 불포함
		// 문자열 추출 시 이용
		System.out.println(str.substring(index1, index2));
		return str.substring(index1, index2);
				
	}
}
