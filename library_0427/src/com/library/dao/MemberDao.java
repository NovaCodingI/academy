package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;
import com.library.vo.Member;

public class MemberDao {
	
	/**
	 * 사용자 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member login(String id, String pw) {
		Member member = null;
		
		String sql = String.format("select id, name, adminyn, status, grade from member"
										+ " " + "where id = '%s' and pw = '%s'", id, pw);
		// 쿼리출력 - 에러 찾기 위함!!
//		 System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			// 질의결과 결과집합을 member객체에 담아줍니다 // 필요한정보 받아오기
			if(rs.next()) {
//				String getId = rs.getString(1); // 변수에 담아줍니다 겹쳐서 에러나므로 getid로~ 사실상 id가 있으므로 안담아도 됌 (1)번 건너뛰기
//			    admin	관리자	Y	Y	B 순서로!!
				String name = rs.getString(2);
				String adminYN = rs.getString(3);
				String status = rs.getString(4);
				String grade = rs.getString(5);
				
				member = new Member(id, "", name, adminYN, status, grade); // 비밀번호는 담고싶지 않아요!!
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
	}
	
	public int insert(Member member) {
		int res = 0;
//		String sql = String.format("INSERT INTO member VALUES" + " " + "('%s', '%s', '%s' , '%s', '%s', '%s')"
//							, member.getId(), member.getPw(), member.getName(), member.getAdminYN(), member.getStatus(), member.getGrade());
//		String sql = String.format("INSERT INTO MEMBER (id, pw, name) VALUES" + " " + "('%s', '%s', '%s')"
//				, member.getId(), member.getPw(), member.getName());
		String sql = String.format("INSERT INTO MEMBER (id, pw, name,adminYN) VALUES" + " " + "('%s', '%s', '%s', '%s')"
				, member.getId(), member.getPw(), member.getName(), member.getAdminYN());
		System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement()) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("회원 입력이 잘못되었습니다.");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * 아이디 중복 체크
	 * 중복일경우 false 리턴
	 * 
	 * @param id
	 * @return
	 */
	public boolean idCheck(String id) {
		boolean res = false;
		// 아이디 체크가 true 면 통과 false 이면 x
		// 지금 없음으로 받고있다!!
		String sql = String.format("select * from member where id = '%s'", id); // + 로 연결해도 되지만 String.format
//		System.out.println(sql);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
//			쿼리의 실행결과 반대로!!
			// rs.next = 결과집합이 있으면 true -> !rs.next를 반환
			// !rs.next() 이면 하는 이유 !! 벨리데이션 체크!! 트루를 반환하기위해서 없으면!! false로 진행..?
			return !rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
//	중복체크 다른 버전
//	public boolean idCheck(String id) {
//	    String sql = "SELECT COUNT(*) FROM member WHERE id = ?";
//	    int count = 0;
//	    System.out.println("아이디 중복입니다");
//	    try (Connection conn = ConnectionUtil.getConnection();
//	        PreparedStatement pstmt = conn.prepareStatement(sql)) {
//	        pstmt.setString(1, id);
//	        ResultSet rs = pstmt.executeQuery();
//	        if (rs.next()) {
//	            count = rs.getInt(1);
//	        }
//	    } catch (SQLException e) {
//	        System.err.println("아이디 중복 체크에 실패했습니다.");
//	        System.err.println(e.getMessage());
//	        e.printStackTrace();
//	    }
//	    return count > 0;
//	}
	
	public int delete(String id) {
		int res = 0;
		
		String sql = String.format("DELETE FROM MEMBER WHERE ID = '%s'", id);
		
		System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				//res = stmt.executeUpdate(sql); -- 에러남 밖으로 빼줘야함!!
				) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	
	
	
}
