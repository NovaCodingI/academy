package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {
	
	
	
	/**
	 * 도서 목록 조회
	 * @return
	 */
	// public 을 빼면 패키지가 달라서 문제 생김!! 다른패키지에 접근 불가능
	public List<Book> getList(){
		// 책 넣을꺼야!! 지정해주는 것
		List list = new ArrayList<Book>();
		//List<Book> list = new ArrayList<Book>();
		
//		String sql ="SELECT * FROM BOOK ORDER BY NO DESC"; // 이것은 북서비스!! 렌트 서비스로 바뀐뒤 주석처리됌!!
		String sql ="SELECT NO, TITLE, NVL((SELECT 대여여부 FROM 대여 WHERE 도서번호 = NO AND 대여여부 = 'Y'),'N') RENTYN, AUTHOR FROM BOOK ORDER BY NO";
		
		// try ( 리소스생성 ) => try문이 종료되면서 리소스를 자동으로 반납
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery : ResultSet 반환타입!! 질의한 쿼리에 대한 결과집합
				// stmt.executeUpdate : int (몇건이 처리 되었는지!!) 반환타입
				ResultSet rs = stmt.executeQuery(sql)) {
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				// 한줄을 읽어 올 때마다 책 생성
				Book book = new Book(no, title, rentYN, author);
				list.add(book);
			}
			// for(Book book) //List<Book> list = new ArrayList<Book>();  오브젝트 타입이라서.. 등등
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; // 리스트 반환!! null 반환하면 안됩니다!!
	}
	
	
	/**
	 * 도서 삽입(등록)
	 * @param book
	 * @return
	 */
	public int insert(Book book) {
		int res = 0;
		
		String sql = String.format
				("INSERT INTO BOOK VALUES (SEQ_BOOK_NO.NEXTVAL, '%s', '%s', '%s')"
						, book.getTitle(), book.getRentyn(), book.getAuthor()); // 홑따옴표로 묶어주는법!! 왜냐하면 + 로 하기 번거롭기떄문에 
		// 실행될 쿼리를 출력해봅시다
		System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection(); // 사용하기 위해서 담아야함 
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	
	/**
	 * 도서 삭제
	 * @return
	 */
	public int delete(int no) {
		int res = 0;
		
		String sql = String.format
				("DELETE FROM BOOK WHERE no = '%d'", no);
		System.out.println(sql);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
		
	}
	
	/**
	 * 도서 업데이트
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public int update(int no, String rentYN) {
		int res = 0;
		
		String sql = String.format
				("UPDATE BOOK SET rentYN = '%s' where no = %d", rentYN, no);
		System.out.println(sql);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
		
	}


	public String getRentYN(int bookNo) {
		// SELECT RENTYN FROM BOOK WHERE NO = 14;
		//String sql = "SELECT RENTYN FROM BOOK WHERE NO = " + bookNo;
		String rentYN = ""; // 빈 문자열 넣어두고 반환하기! return~~
		String sql = String.format("SELECT RENTYN FROM BOOK WHERE NO = %s", bookNo);
		
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			// 쿼리의 실행 결과 집합.. 맨위를 가르키고있는데 다음줄이 있니? 있으면~ true 없으면 false 다음줄이 있니? if 문으로 물어본다
			// 조회된 행이 있는지 확인 // 만약 없으면 빈문자열을 반환 하는것!! rentYN = "";
			if(rs.next()) {
				// DB에 조회된 값을 변수에 저장
				rentYN = rs.getString(1); // 값이 있으면 첫번째꺼 받아와~ 그리고 rentYN에 저장! 변수에 저장!
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rentYN;
	}
}
