package arrayEx;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		int[] scores = {80, 90 , 70, 100};
		
		int sum = 0;
		
		for(int x : scores) {
			
			// 점수의 누계를 구하고 싶어요!! //sum = sum + x;
			sum += x;
			
			System.out.println(x);
//			System.out.println(scores); x 값으로 넣어야 배열의 값이 나옴
			
		}
		System.out.println("점수의 총합 : " + sum);
		System.out.println("평균 점수 :" + sum/scores.length);
		
	}
}
