package com.kh.object.practice;

public class Product {
	
	private String id;
	private String name;
	private String site;
	private int price;
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = 1200000;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = 0.05;
	}

	private double tax;
	
	
	
	public Product() {
		
	}
	
	public Product(String id, String name, String site,
					int price, double tex) {
		
		this.id = "ssgnote9";		
		this.id = "lgxnote5";		
		this.id = "ktsnote3";		
		this.name = "갤럭시노트9";
		this.name = "LG스마트폰5";
		this.name = "KT스마트폰3";
		this.site = "경기도 수원";
		this.site = "경기도 평택";
		this.site = "서울시 강남";
		
		
	}
	
	public String information(String information) {
		return information;
	}

}
