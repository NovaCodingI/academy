package arrayEx;

public class ArrayEx6 {

		public static void main(String[] args) {
			
			// 2차원 배월
			// 마치 행열과 같이 선언
			// 타입[][] 변수명 = 타입[행][열];
			int[][] scores = new int[3][3];

			scores[0] =  new int[] {1,2,3};
			scores[1] =  new int[] {4,5,6};
			System.out.println("scores.length : " + scores.length);
			System.out.println("scores[0] : " + scores[0].length);
			System.out.println("scores[1] : " + scores[1].length);
			System.out.println("scores[0][0] : ");
			System.out.println(scores[0][0]);
			System.out.println("scores[0][1] : ");
			System.out.println(scores[0][1]);
			System.out.println("scores[1][2] : ");
			System.out.println(scores[1][2]);
			
			for(int i=0;i<scores.length;i++) {
				int [] points = scores[i];
				for(int j=0;j<points.length;j++) {
					System.out.printf("(%d,%d)=%d",i ,j ,points[j]);
				} 
				System.out.println();
				
				
			}
			// 변수이름[][]
			
			
		}
}
