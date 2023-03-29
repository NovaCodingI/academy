package com.jungang.object;

public class Product {
	
	private String id;
	private String name;
	private String site;
	private int price;
	private double tex;
	
	public Product(){
		
	}
	
	
	public Product(String id, String name, String site, int price, double tex) {
//		super();
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tex = tex;
	}



	public String information(){
		return getId() + " " + getName() + " " + getSite()
		               + " " + getPrice() + " " + getTex();
	}

	public void calc () {
		
		System.out.println("상품명 = " + getName());
		int res = (int)(getPrice() + (getPrice()*getTex()));
		System.out.println("부가세 포함 가격 = " + res + "원");
		
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTex() {
		return tex;
	}

	public void setTex(double tex) {
		this.tex = tex;
	}
	

}
