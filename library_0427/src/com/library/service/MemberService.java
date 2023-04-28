package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;

public class MemberService {

	MemberDao dao = new MemberDao();
	
	/**
	 * 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
	
	public Member login(String id, String pw) {
		Member member = null;
		
		member = dao.login(id, pw);
		if(member == null) {
			System.err.println("아이디/비밀번호를 확인해주세요");
		} else {
			System.out.println(member.getName()+"님 환영합니다.");
		}
		return member; 
	}
	
	public void insert(String id, String pw, String name, String adminYN) {
		
		// 아이디 중복체크
		boolean idCheck = dao.idCheck(id);
		if(idCheck) {
			Member member = new Member(id, pw, name, adminYN, null, null);
			int res = dao.insert(member);
			if(res>0) {
				System.out.println(res + "건 입력 되었습니다.");
			} else {
				System.err.println("입력중 오류가 발생 하였습니다.");
				System.err.println("관리자에게 문의 해주세요");
			}
			
		} else {
			System.err.println("아이디가 중복 되었습니다.");
		}
		
	}

	public void delete(String id) {
		Member member = new Member(id, null, null, null, null, null);
		int res = dao.delete(id);
		if(res>0) {
			System.out.println(res + "건 입력 되었습니다.");
		} else {
			System.err.println("입력중 오류가 발생 하였습니다.");
			System.err.println("관리자에게 문의 해주세요");
		}
	}

	// 아이디중복체크 추가
	public boolean idCheck(String id) {
		boolean res = dao.idCheck(id);
		if(!res) {
			System.out.println("아이디가 중복 되었습니다.");
		}
		return res;
	}
	
	
}

