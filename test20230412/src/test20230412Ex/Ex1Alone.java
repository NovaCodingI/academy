package test20230412Ex;

/*
[문항1]  구구만 만들기 
2단 ~ 9단 까지 구구단중 홀수단만 출력하는 프로그램을 작성하시오
	2단~9단 모두 출력될 경우 10점
	홀수단만 출력될 경우 20점
*/

public class Ex1Alone {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			
			if(i%2==1) {
				System.out.println();
				System.out.println(i + "단");
				for(int j=1;j<=9;j++) {
					System.out.println(i + "x" + j + "=" + (i*j));
				}
			}
		}
	}
}
