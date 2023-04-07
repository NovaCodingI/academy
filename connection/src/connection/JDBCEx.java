package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

	public class JDBCEx {
	
	
	public static void main(String[] args) {
		JDBCEx ex = new JDBCEx();
		ex.getList();
		ex.update();
		ex.insert();
		ex.delete();
		
	}
	
	
	/*
	 * 오토커밋 - false 설정
		6건 처리 되었습니다.
		롤백 되었습니다.

	 */
	
	public void update() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			// 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB 연결설정
			Connection conn = DriverManager.getConnection(url, id, pw);
			
//			System.out.println("오토커밋 - false 설정");
//			conn.setAutoCommit(false);
			
			// 쿼리 실행 객체 생성
			Statement stmt = conn.createStatement();
			// 쿼리 실행
			int  res = stmt.executeUpdate("update book set isrent = 'Y' where no = 10");
			// 결과 출력
			System.out.println(res + "건 처리 되었습니다.");
			
			
			conn.rollback();
			System.out.println("업데이트 되었습니다.");
			
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 라이브러리를 확인해주세요");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void delete() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션을 얻어오기 위해 필요한 정보
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("오토커밋 - false 설정");
			conn.setAutoCommit(false); // 자동커밋을 하지 않는다는 의미 close 가 되면서 자동 커밋이 되긴함. 그래서 conn.rollback();
			// 쿼리 실행 준비
			Statement stmt = conn.createStatement();
			// 몇건이 처리 되었는지 반환
			int res = stmt.executeUpdate("delete from book");
			System.out.println(res + "건 처리 되었습니다.");
			conn.rollback();
			System.out.println("롤백 되었습니다.");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 라이브러리를 확인해주세요");
		} catch (SQLException e) {
			
		}
	}
	
	public void insert() {
		
		// 데이터 베이스 접근시 필요한 정보
		// ip, port, sid 계정정보, 비밀번호
		// "jdbc:oracle:thin:@localhost(ip):1521(포트):orcl(SID)";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn;
		
		// 클래스 로딩
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			
//			ResultSet rs = stmt.executeQuery("select * from book");
//			System.out.println("rs.getFetchSize : " + rs.getFetchSize());
			// 몇건이 처리되었는지 반환
			int res = stmt.executeUpdate("insert into book values (10, '오라클을 다루는 기술', '박찬미', 'N', sysdate, null)");
			List<Book> list = new ArrayList<>();
			System.out.println(res + "건 처리 되었습니다.");
			
				
			stmt.close();
			conn.close();
				

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 커넥션 얻어오기
		// 쿼리 실행객체 생성하기
		// 쿼리 실행 후 결과집합 받아오기
	}
	
	
	
	
	
	public void getList() {
		
		// 데이터 베이스 접근시 필요한 정보
		// ip, port, sid 계정정보, 비밀번호
		// "jdbc:oracle:thin:@localhost(ip):1521(포트):orcl(SID)";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn;
		
		// 클래스 로딩
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			
			// " " 문에 ; 세미클론 추가 안하게 유의하고 sql developer 에서 확인 후 추가해라
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			System.out.println("rs.getFetchSize : " + rs.getFetchSize());
			
			List<Book> list = new ArrayList<>();
			
			while (rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editDate = rs.getDate(6);
				
				Book book
					= new Book(no, title, author, isRent, regdate, editDate);
				
				list.add(book);
				}
				
				System.out.println(list);
				for(Book book : list) {
					System.out.println(book.toString());
					
				}
				
				rs.close();
				stmt.close();
				conn.close();
				
				
			
//			while (rs.next()) {
//				//rs.next(); // 한줄을 캐치해온다.
//				System.out.print(rs.getInt(1));
//				System.out.print(rs.getString(2));
//				System.out.print(rs.getString(3));
//				System.out.print(rs.getString(4));
//				System.out.print(rs.getDate(5));
//				System.out.print(rs.getDate(6));
//				System.out.println();
//			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 커넥션 얻어오기
		// 쿼리 실행객체 생성하기
		// 쿼리 실행 후 결과집합 받아오기
	}
	
	public void ConnectionTest() {
		
		// 데이터 베이스 접근시 필요한 정보
		// ip, port, sid 계정정보, 비밀번호
		// "jdbc:oracle:thin:@localhost(ip):1521(포트):orcl(SID)";
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn;
		
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 얻기 성공 : " + conn);
			// 쿼리 실행
			Statement stmt = conn.createStatement();
			
			// 데이터 조회
			// executeQuery(쿼리문장 입력)
			// ResultSet : 결과 집합
			ResultSet rs = stmt.executeQuery("select count (*) from book");
			rs.next();
//			System.out.println("조회결과 :" +rs.getString(1));
			System.out.println("조회결과 :" +rs.getInt("count(*)"));
			
			// 자원 반납  아래서부터 !!
			rs.close();
			stmt.close();
			conn.close();
			// 데이터 생성, 수정, 삭제
			// stmt.executeUpdate("");
			
			
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
