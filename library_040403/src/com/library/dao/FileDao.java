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
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		
		try (FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);	){
			
			String readLine = "";
			
			while((readLine = br.readLine()) != null) {
				Book book = makeBook(readLine);
				
				if(book != null) {
					list.add(book);
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		return list;
	}

	private Book makeBook(String readLine) {
		
		Book book = null;
		try {
			String[] strArray = readLine.split(" ");
			
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			boolean isRent = Boolean.parseBoolean(strArray[3]);
			book = new Book(no, title, author, isRent);
			
		} catch (Exception e) {
			System.err.println(readLine + " : 파싱중 오류가 발생 하였습니다.");
		}
		
		return book;
	}

	@Override
	public boolean listToFile(List<Book> list) {

		try (FileWriter fw = new FileWriter("bookList.txt");){
			
			for(Book book : list) {
				
				fw.write(book.toString() + "\n");
				
			}
			fw.flush();
			return true;
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return false;
	}

}
