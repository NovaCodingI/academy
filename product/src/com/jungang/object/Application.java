package com.jungang.object;

public class Application {
	
	public static void main(String[] args) {
		
	Product product1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
	Product product2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
	Product product3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

	System.out.println( product1.information() );
	System.out.println( product2.information() );
	System.out.println( product3.information() );
	System.out.println( "==========================" );
	
	product1.setPrice(120000);
	product2.setPrice(120000);
	product3.setPrice(120000);
	
	product1.setTex(0.05);
	product2.setTex(0.05);
	product3.setTex(0.05);
	
	System.out.println( product1.information() );
	System.out.println( product2.information() );
	System.out.println( product3.information() );
	System.out.println( "==========================" );
	
	
	product1.calc();
	product2.calc();
	product3.calc();
	
	}

}
