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
		 System.out.println("FileDao.getList() 시작");
		 List<Book> list = new ArrayList<>();
		 
		 try (FileReader fr = new FileReader("bookList.txt");
				 BufferedReader br = new BufferedReader(fr); ) {
			 String str = "";
			
			 
			 while((str=br.readLine()) != null) {
				 
				 Book book = makeBook(str);
				 
				 if(book != null) {
					 list.add(book);
				 }
			 }
			 System.out.println("FileDao.getList() 종료");
			 
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			e1.printStackTrace();
		}
		 
		return list;
	}
	
	public Book makeBook (String str) {
		
		Book book = null;
		
		try {
			
			String[] strArry = str.split(" ");
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			boolean isRent = Boolean.parseBoolean(strArry[3]);
			book = new Book(no, title, author, isRent);
			
		} catch (Exception e) {
			System.err.println("리스트 생성중 오류가 발생 하였습니다.");
			System.err.println("====== readLine() : " + str);
		}
		
		return book;
	}

	@Override
	public boolean saveFile(List<Book> list) {
		try ( FileWriter fw = new FileWriter("bookList.txt"); ) {
			for(Book book : list) {
				
				fw.write(book.toString() + "\n");
		}
		fw.flush();
		return true;
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return false;
			
	}

}
