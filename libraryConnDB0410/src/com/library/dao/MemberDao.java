package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.controller.MemberVo;
import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;

public class MemberDao {
	public MemberVo login(String id, String pw) {
		List<MemberVo> list = new ArrayList<>(); // member list 만들어보기
		// 매개변수를 ?로 입력
		String sql = "select * from member where id = ? and pw = ?";
		System.out.println("id : "+id);
		System.out.println("pw : "+pw);
		try (Connection conn = DBUtil.getConnection();
				// Statement는 executeQuery에서 넣어주는것이다.
//				Statement stmt = conn.createStatement(); =
				PreparedStatement pstmt = conn.prepareStatement(sql); // 파라메터를 넣는데 조금더 편하게 사용함. 쿼리를 먼저 넣어주고 값을 세팅하고 실행.
				// conn 으로 넘어올때 sql 문장을 실행해주는것 
				
				){
				pstmt.setString(1, id);	
				pstmt.setString(2, pw);	
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
//					String id = rs.getString("id"); 안받아도 됨.X
					String name = rs.getString("name");
					String adminYN = rs.getString("adminYN");
					MemberVo memberVo = new MemberVo(id, "", name, adminYN);
					System.out.println(list.add(memberVo)); // member list 만들어보기
					return memberVo;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// id/pw가 일치하는 사용자를 찾을 수 없음
		return null;
	}
	
	// 나 혼자 만들어본 member list //
	public List<MemberVo> getList() {
		List<MemberVo> list = new ArrayList<>(); // member list 만들어보기
		// 매개변수를 ?로 입력
		String sql = "select * from member";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
				while(rs.next()) {
					String id = rs.getString("id");
					String pw = rs.getString("pw");
					String name = rs.getString("name");
					String adminYN = rs.getString("adminYN");
					MemberVo memberVo = new MemberVo(id, "", name, adminYN);
					list.add(memberVo); // member list 만들어보기
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// id/pw가 일치하는 사용자를 찾을 수 없음
		return list;
	}
	// 나 혼자 만들어본 member list //
	
	
	
	

	/**
	 * 사용자의 정보를 데이터 베이스에 등록 합니다.
	 * @param memberVo
	 * @return
	 * 
	 * 나를 호출한 곳으로 보내버림.. 에러나면.. 뜨로우 하는거 비추.
	 */
	public int insertMember(MemberVo memberVo) {
		String sql = "insert into member values (?, ?, ?, ?)";
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res = pstmt.executeUpdate();
			
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
						// 내가 해본것 //
//	public int deleteMember(MemberVo memberVo) {
//		String sql = "delete from member where id = ? and pw = ? and name = ? and adminYN = ?";
//		try (Connection conn = DBUtil.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement(sql);){
//			pstmt.setString(1, memberVo.getId());
//			pstmt.setString(2, memberVo.getPw());
//			pstmt.setString(3, memberVo.getName());
//			pstmt.setString(4, memberVo.getAdminYN());
//			
//			int res = pstmt.executeUpdate();
//			return res;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		return 0;
//	}
						// 내가 해본것 //

	/**
	 * 데이터 베이스에 등록된 사용자 정보를 삭제합니다.
	 * Statement
	 * createStatement  반환타입 : Statement 
	 * 	- 쿼리 자체를 String 문자열로 넣어주기 때문에
	 * 		문자가 값으로 들어가는 경우 '' 처리를 해줘야 합니다.
	 * 
	 * PreparedStatement
	 * 	- Statement 클래스보다 기능이 향상된 클래스
	 *  - 코드의 안정성과 가독성이 높다
	 *  - 인자 값으로 전달이 가능
	 *  - 매개변수를 ?로 설정하고 (?에 '' 처리를 하지 않습니다.)
	 *  	setString(index,값)
	 *  	setInt(index, 값);
	 *  
	 *  
	 *  
	 * @param id
	 * @return
	 */
	public int deleteMember(String id) {
//		String sql = "delete from member where id = ' " + id + "'";  // Statement 진행시 ' 넣어주어야함.
		String sql = "delete from member where id = ?"; 
		System.out.println(id + "============");
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt =  conn.prepareStatement(sql);){
			
			pstmt.setString(1, id);
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
