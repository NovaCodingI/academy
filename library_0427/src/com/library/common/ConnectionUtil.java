package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB Connection을 생성 하여 반환 합니다.
 * 2023.04.27 생성
 *  * @author jij
 *
 */
public class ConnectionUtil {
	
	/**
	 * DB Connection을 반환 합니다
	 * @return Connection
	 */
	public static Connection getConnection() {
		
		// 접속정보 (ip, port, sid, 계정아이디, 계정비밀번호)
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "library";
				String pw = "1234";
				
				Connection conn = null;
				
				try {
					// 드라이버 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 커넥션 생성
					conn = DriverManager.getConnection(url, id, pw); // 생성자의 오버로딩 // 변수에 담아주는 사유는 재사용하기 위해서
					// 트랜젝션 처리를 위해 자동커밋을 false로 설정
					// -> 커넥션이 종료 되는 시점에 커밋
					conn.setAutoCommit(false);
					
					// 필요없는 내용 return conn; 반환 때문
//					System.out.println(conn);
//					System.out.println("프로그램 종료!");
//					
//					// 커넥션 닫기
//					if(!conn.isClosed()) conn.close();
					
					
				} catch (ClassNotFoundException e) {
					System.err.println("라이브러리를 확인해주세요!");
					System.err.println(e.getMessage());
					e.printStackTrace();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
				return conn;
			}
	// 롤백
	public void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			System.err.println("rollback 실패");
			e.printStackTrace();
		}
	}
	
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.close(); // null point exception 발생 예방하기 위해 and 로 묶는다 && 그리고
		} catch (SQLException e) {
			System.err.println("conn.close() 실패");
			e.printStackTrace();
		}
		
	}
	
		
	public static void close(Connection conn, Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close(); // null point exception 발생 예방하기 위해 and 로 묶는다 && 그리고
		} catch (SQLException e) {
			System.err.println("stmt.close() 실패");
			e.printStackTrace();
		}
		
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close(); // null point exception 발생 예방하기 위해 and 로 묶는다 && 그리고
		} catch (SQLException e) {
			System.err.println("rs.close() 실패");
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// 접속정보 (ip, port, sid, 계정아이디, 계정비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "library";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 생성
			conn = DriverManager.getConnection(url, id, pw); // 생성자의 오버로딩 // 변수에 담아주는 사유는 재사용하기 위해서
			System.out.println(conn);
			System.out.println("프로그램 종료!");
			
			// 커넥션 닫기
			if(!conn.isClosed()) conn.close();
			
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요!");
			System.err.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
