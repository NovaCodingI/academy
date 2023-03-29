package member.service;

public class MemberService1 {
	
	// 접근제한자 반환타입 메소드명 (매개변수타입 매개변수명) { }
	
	public boolean login(String id, String password) {
//		id.equals("hong");
		// id에 null이 들어올 경우 
		// null point Exception이 발생할 우려가 있다
		// null이 아닌 경우 체크로직을 실행하거나 "hong" (문자열).equals를 사용한다
		
		if(id != null &&
				"hong".equals(id) && "12345".equals(password)) {
			return true;
		}
		
		return false;
		
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
