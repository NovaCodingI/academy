package member.service;

public class MemberService2 {
	
	public String id;
	public String pw;
	
	// 생성자
	public MemberService2(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void MemberService4(String id) {
		
	}
	
	// 로그인
	
	public boolean login(String id, String pw) {
		// id, pw 필드에 값과 비교하여 일치하면 true 아니면 false
		// this.id : 필드
		// id : 매개변수
		if(id!=null
				&& id.equals(this.id)
				&& pw!=null
				&& pw.equals(this.pw)) {
			System.out.println("로그인 성공");
			return true;
			
		}
		System.out.println("로그인 실패");
		return false;
	}
	// 로그아웃
	// id님이 로그아웃 하셨습니다 메세지 출력
	
	public void logout() {
		if(id!=null
				&& id.equals(this.id)) {
			System.out.println(id + " 님이 로그아웃 되었습니다.");
			
		}
	}

}
