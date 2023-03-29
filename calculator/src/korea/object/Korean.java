package korea.object;

public class Korean {
	
	// 필드는 마치 변수처럼 선언하면 된다.
	// 타입 변수명
	
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 기본 생성자
	public Korean() {
		
	}
	
	public Korean(String n, String s) {
		// 필드 초기화
		
		name = n;
		ssn = s;
		
	}
}
