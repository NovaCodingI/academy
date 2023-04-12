package test20230412;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
[문항4]  ojdbc 라이브러리를 이용하여 DB connection 을 생성하고 DB로 부터 현재 날자를 조회하여 출력 하는 프로그램을 작성 하시오. 
**필요 첨부 파일 lib 폴더에 ojdbc8.jar, orai18n.jar 파일 copy 하여 Java Build Path 진행함**
*/

public class Ex4 {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Oracle JDBC 드라이버 로드
			conn = DriverManager.getConnection(url, id, pw); // DB 연결
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL"); // 현재 날짜, 시간 조회 쿼리 실행
			if (rs.next()) {
				String currentDateTime = rs.getString(1);
				System.out.println("현재 날짜, 시간: " + currentDateTime);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
