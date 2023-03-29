package com.kh.object.practice;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book () {
		
	}
	
	public Book (String title, int price,
					double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
	}
	
	public String information() {
		return getTitle() + "	" + getPrice()
		+ "	" + getDiscountRate() + "	" + getAuthor();
	}

	
	
	
	public String getTitle() {
		return "C언어";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = 30000;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = 0.1;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = "홍길동";
	}

}
