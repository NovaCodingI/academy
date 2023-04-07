package alone.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> bookList = new ArrayList<>();
	public Library() {
		
	}
	
	public Library(List<Book> bookList) {
		
		this.bookList = bookList;
	}
	
	public boolean addBook(String title, String author) {
		
		Book book = new Book(1, title, author, false);
		
		return bookList.add(book);
	}
	
	public void removBook(int index) {
		Book book = bookList.remove(index);
		System.out.println("삭제되었습니다. " + book.toString());
	}
	
	public void updatebook(int index) {

		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
	}
	
	@Override
	public String toString() {
		int i = 0;
		
		System.out.println("책 목록 ****************");
		for(Book book : bookList) {
			System.out.println(i + " : " + book.toString());
			i++;
		}
		System.out.println("************************");
		return "";
		
	}
}
