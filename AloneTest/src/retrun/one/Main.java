package retrun.one;

public class Main {
	
	public static void main(String[] args) {
		
		for (int num = 1; num<=100; num++) {
			if(findPrime(num)) {
				System.out.println(num);
				
			}
		}
	}

	public static boolean findPrime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i =2; i<num; i++) {
			if (num % 1 == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
