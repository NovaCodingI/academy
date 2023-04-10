package com.library.controller;

public class MemberVo {
	String id;
	String pw;
	String name;
	String adminYN;
	
	public MemberVo(String id, String pw, String name, String adminYN) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.adminYN = adminYN; /* Y : 관리자 계정 */
	}
	
	// setpw은 할수있지만 비밀번호는 가지고 올수만 있게 만듬 비밀번호니까.. getpw 지워주기.
	@Override
	public String toString() {
		return getId()
				+ " " + getName()
				+ " " + getAdminYN();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}
	
	

}
