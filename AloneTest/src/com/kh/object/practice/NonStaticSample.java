package com.kh.object.practice;

public class NonStaticSample {
	
	public void printLottoNumber() {
		
		int num[] = new int[6];
		
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0;j<i;j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		for(int i=0;i<num;i++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	public char alphabette() {
		int num = 0;
		
		while(true) {
			num = (int)(Math.random() * 58 + 65);
			
			if(num>='a' && num<='z' || num>='A' && num<='Z') {
				break;
			}
		}
		
		return (char)num;
	}
		
		public String mySubstring(String str, int index1, int index2) {
			
			String result = null;
			
			if(!str.equals("")) {
				for(int i = index1; i<index2; i++) {
						result += str.charAt(i);
				}
						
//				result = str.substring(index1, index2);
			}
			return result;
		}
		
	}
	

