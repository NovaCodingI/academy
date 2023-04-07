package forEx;


public class Random {
	public static void main(String[] args) {
		printLottoNumbers();
	}
	
	static public void printLottoNumbers(){
		int[] lotto = new int[6];

		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		int temp = 0;
		
		for(int i=0;i<lotto.length;i++) {
			
			// j=0부터 비교를 시작하면 내림차순
			// j=i부터 비교를 시작하면 오름차순
			for(int j=i;j<lotto.length;j++) {
				
				if(lotto[i] > lotto[j]) {
					// 자리바꾸기
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int num : lotto) {
			System.out.println(num);
		}

		
		
	}
}