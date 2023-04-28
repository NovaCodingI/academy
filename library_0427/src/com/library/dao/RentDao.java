package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;

/**
 * DB에 연결 데이터 입출력 처리
 * @author user
 *
 */
public class RentDao {
	
	//테스트를 위해 메인메소드 임시 생성
//	public static void main(String[] args) {
//		RentDao dao = new RentDao();
//		
		// 반납테스트
//		System.out.println(dao.update(3));
		// 입력테스트
//		System.out.println(dao.insert("user", 3));
		// 대여테스트
//		System.out.println(dao.getRentYN(4)); // Y가 아니면 N Y면 Y
//	}
	
	/**
	 * 도서가 대출중인지 확인
	 * 
	 * @param bookNo
	 * @return 대출중 : Y 반환!!
	 * 			대출가능 : N 반환!!
	 */
	public String getRentYN(int bookNo) {
		String rentYN = "N"; // "N" 기본값을 N으로 준다면..
		String sql = "select 대여여부 from 대여 where 도서번호 = ? and 대여여부 = 'Y'";
		
		// sql 연산 안하기위해서 하는방법 + 연산은 새로 생성해서 연산하기때문에 메모리측면에서 불리함!! 
//		StringBuffer sb = new StringBuffer();
//		sb.append("select 대여여부 ");
//		sb.append("from 대여 ");
//		sb.append("where 도서번호 = 4 and 대여여부 = 'Y'");
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);)
				 {
			// ? 에 들어갈 세팅해줘야한다.
			// 파라메터 세팅 : ?표에 순서대로 입력
			pstmt.setInt(1, bookNo);
			// 쿼리실행 // 쿼리를 실행하고 파라메터를 입력하면 못찾기때문에 순서가 중요함
			ResultSet rs = pstmt.executeQuery(); // 나중에 만들었기때문에 반납하기!!
			
			// 만약에 결과집합이 있으면 가지고왕
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
	
	public int insert(String id, int bookNo) {
		int res = 0;
		String sql = "INSERT INTO 대여 "
						+ "VALUES (SEQ_대여.NEXTVAL, ?, ?, 'Y'"
						+ ", sysdate, null, sysdate+7, null)";
		// INSERT INTO 대여 VALUES (SEQ_대여.NEXTVAL, 'user', 1, 'Y', '2023-04-28', null, to_date('2023-04-28')+7, null);
		
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, id);
			pstmt.setInt(2, bookNo);
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int update(int bookNo) {
		int res = 0;
		String sql = "UPDATE 대여 "
				+ "SET 반납일 = SYSDATE, 대여여부 ='N' "
				+ "WHERE 도서번호 = ?";
		// UPDATE 대여 SET 반납일 = SYSDATE, 대여여부 ='N' WHERE 도서번호 = 3
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setInt(1, bookNo);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
}
