package com.kh.object.practice;

public class Lotto {
	
	public static void main(String[] args) {
		printLottoNumbers();
	}
	
	static public void printLottoNumbers() {
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
			
			for(int j=0;j<lotto.length;j++) {
				
				if(lotto[i] > lotto[j]) {
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
