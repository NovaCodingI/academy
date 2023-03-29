package sec04.verify.exam03;

public class MemberService {
	
	String id;
	String password;
	
	public boolean login(String id, String password) {
	
		this.id = id;
		this.password = password;
		
		if(id.equals("hong") && password.equals("12345")) {
//			System.out.println("로그인 되었습니다.");
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
