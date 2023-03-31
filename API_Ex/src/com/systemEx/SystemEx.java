package com.systemEx;

public class SystemEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		// 수행시간 구하기
		// 1/1000초를 구합니다.
		Long startTime = System.currentTimeMillis(); // 1초를 얻기 위해선 1000으로 나눠줘야함(환산)
		

//		System.in;
//		System.out;
		
		int sum = 0;
		for(int i=0;i<3;i++) {
			
			sum += i;
			
			if(i==2) {
				// 프로그램 종료
				// JVM 강제 종료
				System.exit(0);
			}
			Thread.sleep(1000);
			// 1초 대기
		}
		System.out.println("총 합계 : " + sum);
		
		Long endTime = System.currentTimeMillis();
		
		long result = (endTime - startTime)/1000;
		
		System.out.println(result + " 초 소요되었습니다.");
	}

}
