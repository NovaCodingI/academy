package book.object;

import book.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
//		System.out.println(
//				book1.getTitle()
//				+ "\t" + book1.getPrice()
//				+ "\t" + book1.getDiscountRate()
//				+ "\t" + book1.getAuthor()
//				);
//		
//		System.out.println(
//				book2.getTitle()
//				+ "\t" + book2.getPrice()
//				+ "\t" + book2.getDiscountRate()
//				+ "\t" + book2.getAuthor()
//				);
		book1.print();
		book2.print();
		System.out.println("================================");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		book1.print();
		System.out.println("================================");
		book1.printPrice();
		book2.printPrice();
		
	}
}
