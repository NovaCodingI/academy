package forEx;

public class Ex04_03 {

	public static void main(String[] args) {
		
		System.out.println("2개의 주사위를 던졌을때 나오는 합이 5가되면 멈춰라");

		while(true) {
			
			int i = (int)(Math.random()*6 + 1);
			int j = (int)(Math.random()*6 + 1);
			System.out.println(i + ", " + j);
			
			if((i+j) == 5) {
				break;
			}
			System.out.println("종료 되었습니다.");
			
			
			}
		}
	}
	
