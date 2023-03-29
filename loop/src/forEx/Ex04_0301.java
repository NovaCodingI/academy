package forEx;

public class Ex04_0301 {

	public static void main (String[] args) {
		
		boolean dis = true;
		
		System.out.println("총합이 5가 되면 멈추도록 하시오");
		
		while(dis) {
			
			int i = (int)(Math.random()*6+1 );
			int j = (int)(Math.random()*6+1 );
			System.out.println("("+ i + "," + j + ")");
			
			 if((i+j) == 5) {
				 
				 System.out.println("총합이 5가 나와 종료되었습니다");
				 break;
			 }
			
			
			
		}
		
	}
	
}
