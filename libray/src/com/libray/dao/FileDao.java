package com.libray.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.libray.vo.Book;

public class FileDao implements Dao {
	
	public static void main(String[] args) {
		FileDao dao = new FileDao();
//		dao.getBookList();
		List<Book> list = new ArrayList<>();
		list.add(new Book(0, "책1", "저자1", false));
		dao.insertBook(dao.getBookList());
		
	}
	@Override
	public List<Book> getBookList() {
		System.out.println("책 리스트를 조회 합니다.");
		List<Book> list = new ArrayList<>();
		
		try(BufferedReader br
				= new BufferedReader(new FileReader("bookList.txt"));) {
			// 파일 읽어오기
			// null(더이상 읽어올 데이터가 없으면)이 될때까지 읽어오기
			String str = "";
//			System.out.println("=======" + br.readLine());
			while((str = br.readLine()) != null) {
				// 1 제목1 작가1 false
				// 읽어온 데이터를 공백으로 구분해서 배열을 생성
				String[] strArray = str.split(" ");
				
				// 생성자의 타입에 맞게 타입을 변환하여 변수에 저장
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isRent = Boolean.parseBoolean(strArray[3]);
				
				list.add(new Book(no, title, author, isRent));
			}
			
			// 공백으로 자르기
			// 책을 생성할 파라메터 만들어주기
			// 책을 생성하기
			// 리스트에 담기
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		
		// 리스트 반환
		return list;
	}

	@Override
	public int insertBook(List<Book> list) {
		
		//true 매개변수를 입력하면 이어쓰기가 됩니다.
		// new FileWriterr("bookList.txt",true)
		
//		try(FileWriter fw = new FileWriter("bookList.txt",true);) {
		try(FileWriter fw = new FileWriter("bookList.txt",false);) {
			
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
		
//			fw.write("안녕하세요"); // .txt 파일 들어가는지 test 문자
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

//		try(BufferedReader br
//				= new BufferedReader(new FileReader("bookList.txt"));){
//			
//			String str ="";
//			while((str = br.readLine()) !=null) {
//				String[] strArray = str.split(" ");
//				int no = Integer.parseInt(strArray[0]);
//				String title = strArray[1];
//				String author = strArray[2];
//				boolean isRent = Boolean.parseBoolean(strArray[3]);
//				
//				list.add(new Book(no, title, author, isRent));
//			}
//			System.out.println("파일로 부터 읽어들인 책 정보를 출력합니다.");
//			for(Book book : list) {
//				System.out.println(book.toString());
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}