package forEx;

public class Ex04_0401 {

	public static void main(String[] args) {
		
		for(int x=1;x<=10;x++) {
			
			for(int y=1;y<=10;y++) {
				
				if((4*x + 5*y) == 60) {
					
					System.out.println("(" + x + "," + y + ")");
					
					break;
				}
			}
		} // for문 종료
		System.out.println("계산이 종료 되었습니다.");
	}
}
