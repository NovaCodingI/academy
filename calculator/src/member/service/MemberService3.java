package member.service;

public class MemberService3 {
	
	// 필드
	public String id;
	public String pw;
	
	// 생성자
	// 생성자를 안만들면 id, pw가 null로 되어 있을것이다
	
	public MemberService3(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	// 메소드
	/**
	 * 로그인 처리
	 * 필드에 등록된 id, pw가 일치 하면 true를 반환
	 * 일치하지 않으면 false를 반환
	 * @param id
	 * @param pw
	 * @return 로그인성공 : true, 로그인 실패 : false
	 */
	public boolean login(String id, String pw) {
		// 필드 id : this.id
		if(id!=null							// 아이디가 null이 아니고 
				&& id.equals(this.id)		// id가 필드의 id값과 동일하고
				&& pw!=null					// pw가 null이 아니고
				&& pw.equals(this.pw)) {	// pw가 필드의 pw값과 동일하면
			System.out.println("로그인 성공");
			return true;
		}
		
		System.out.println("로그인 실패");
		return false;
		
	}
	
	public void logout() {
		// 동일한 이름의 지역변수가 없으니까 (매개변수)에 작성이 안되어있음 String id가 입력되었다면 this.를 입력해야할것이다.
		// id는 필드를 의미합니다.
		System.out.println(id + " 님 로그아웃 되었습니다.");
	}

}
