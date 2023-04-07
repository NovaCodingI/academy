package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {

	@Override
	public List<Book> getBookList() {
		System.out.println("책 리스트를 조회 합니다.");
		List<Book> list = new ArrayList<>();
				
		try (BufferedReader br
			= new BufferedReader(new FileReader("bookList.txt"));) {
			
			String str= "";
			while((str = br.readLine()) != null) {
				
				String[] strArray = str.split(" ");
				
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isRent = Boolean.parseBoolean(strArray[3]);
				
				list.add(new Book(no, title, author, isRent));
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
				
		return list;
	}

	@Override
	public int insertBook(List<Book> list) {

		try (FileWriter fw = new FileWriter("bookList.txt",false);){
			
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			
			fw.flush();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("신규 도서 등록");
		return 0;
	}

	@Override
	public int deleteBook(List<Book> list) {
		System.out.println("도서 삭제");
		return 0;
	}

	@Override
	public int updateBook(List<Book> list) {
		System.out.println("도서 정보 업데이트");
		return 0;
	}

}
