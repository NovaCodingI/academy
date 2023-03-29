package book.object.practice;

public class Book {
	
	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	// 생성자
	public Book() {
		
	}

	public Book(String title, int price, double discountRate, String author) {
		// 선언만하면 값이 호출이 안되니까 세팅 꼭해야함!! 초기화!! this.* 필드에 있는 값을 불러와라
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	public void print() {
		System.out.println(
				getTitle()
		+ "\t" + getPrice()
		+ "\t" + getDiscountRate()
		+ "\t" + getAuthor()
		);
	}
	
	
	public void printPrice() {
		System.out.println("도서명 = " + getTitle() + "원");
		int price = (int)(getPrice() - (getPrice()*getDiscountRate()));
		System.out.println("할인된 가격 = " + price + "원");
	}
	
	
	// 메소드
	public String information() {
		return "";
	}
	
	
	
	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
