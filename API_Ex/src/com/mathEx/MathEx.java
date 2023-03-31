package com.mathEx;

public class MathEx {
	
	public static void main(String[] args) {
		// 절대값
		int i = Math.abs(-5);
		double d = Math.abs(-5.123);
		System.out.println("절대값 : " + i);
		System.out.println("절대값 : " + d);
		
		// 버림
		System.out.println("버림 : " +  Math.floor(d) );
		// 올림
		System.out.println("올림 : " +  Math.ceil(d) );
		// 반올림
		System.out.println("반올림 : " +  Math.round(d) );
		// 최대값
		System.out.println("max : " + Math.max(5.3, 2.6));
		// 최소값
		System.out.println("min : " + Math.min(5, 9));
		
	}

}
