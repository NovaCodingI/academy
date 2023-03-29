package arrayEx;

public class ArrayEx01 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		int score[] = {90, 80, 88, 77};
		
		int j = score.length;
		
		for(int i=0;i<j;i++) {
			
			
			System.out.println(score[i]);
			
			sum += score[i];
			
		}
		
		System.out.println("score의 총합 : " + sum);
		System.out.println("score의 평균 : " + sum/score.length);
		
		
	}

}
