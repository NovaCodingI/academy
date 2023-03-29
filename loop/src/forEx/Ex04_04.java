package forEx;

public class Ex04_04 {

	public static void main(String[] args) {

		// 4x + 5y = 60 모든 해를 구하여 (x,y)형태로 출력하시오
		// x와 y는 10이하의 자연수이다.
		
		for(int x = 1;x<=10;x++) {
			
			for(int y = 1;y<=10;y++) {
				
				if((4*x+5*y) == 60) {
					
					System.out.println("("+ x +"," + y + ")");
					
				}
			}
		}
	}

}
