package forEx;

public class ForGugudan {
	
	public static void main(String[] args) {
		
	//구구단 출력하기
		
		
		for(int dan2=2;dan2<10;dan2++) {
			
			System.out.println("=======" + dan2 + "단=======");
			
			for(int i=1;i<10;i++) {
				
				
				System.out.printf("%d*%d=%d", dan2,i,dan2*i);
				
				System.out.println();
				
		}
			
			
			
		}
	}

}
