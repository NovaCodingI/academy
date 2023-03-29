package forEx;

public class Ex04_02 {

	public static void main(String[] args) {
		
		
		int sum = 0 ;
		
		for(int i =1;i<=100;i++) {
											
			if(i % 3 == 0) {
												
				System.out.println("3의 배수값" + i);
				sum += i;
			} 
			
		}
		
		System.out.println("3의 배수의 총합" + sum);
		
	}
}
