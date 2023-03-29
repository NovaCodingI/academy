package forEx;

public class Ex04_0201 {

	public static void main (String[] args) {
		
		int sum = 0;
		
		for(int i =1;i<=100;i++) {
			
			
			if(i%3 == 0) {
			
				sum += i;
				
				System.out.println("3의 배수 값" + i);
				
				
			}
		}
		
		System.out.println("3의 배수 총 합" + sum);
		
		
		
	}

	
}
