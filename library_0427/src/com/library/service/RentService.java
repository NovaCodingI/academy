package com.library.service;

import com.library.dao.RentDao;

public class RentService {
	RentDao dao = new RentDao();
	
	public String getRentYN(int bookNo){
		String rentYN = dao.getRentYN(bookNo);
		return rentYN;
	}
	
	
	/**
	 * 도서 대여
	 * 
	 * 대여 테이블에 데이터를 입력 합니다.
	 * @param bookNo : 도서번호
	 * @param id : 아이디
	 */
	public void rentBook(int bookNo, String id) {
		// 대여 가능 여부 체크
		String rentYN = dao.getRentYN(bookNo);
		if("Y".equals(rentYN)) {
			System.err.println("이미 대여 중인 도서 입니다.");
			return; // 이미 대여중이여요 하고 끝내버림!
		}
		
		int res = dao.insert(id, bookNo);
		if(res>0) {
			System.out.println(res + " 건 대여 되었습니다.");
		} else {
			System.err.println("대여처리중 문제가 발생했습니다.");
			System.err.println("관리자에게 요청하십시오");
		}
	}
	
	/**
	 * 도서 반납
	 * 
	 * 반납일과 대여여부를 업데이트 합니다.
	 * @param bookNo
	 */
	public void returnBook(int bookNo) {
		// 반납 가능 여부 체크
				String rentYN = dao.getRentYN(bookNo);
				if("N".equals(rentYN)) {
					System.err.println("반납 가능한 도서가 아닙니다.");
					return; // 이미 대여중이여요 하고 끝내버림!
				}
				
				int res = dao.update(bookNo);
				
				// System.out.println(res + " 건 반납 되었습니다."); // if 문 말고 얘만 적어도 됌.
				
				if(res>0) {
					System.out.println(res + " 건 반납 되었습니다.");
				} else {
					System.err.println("대여처리중 문제가 발생했습니다.");
					System.err.println("관리자에게 요청하십시오");
				}
		
	}
}
