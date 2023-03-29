package getter.setter;

public class Person {
	
	static final double PI = 3.14159;
	static final double EARTH_RADIUS = 6400;
	
	// final : 상수 : 한번 값이 정해지고 나면 수정이 불가능
	// 상수는 보통 대문자로 작성한다. 단어와 단어가 연결되면 언더바를 사용한다 ex) PERSON_MAIN
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
		// 상수는 값을 변경하는것이 불가능 !! The final field ssn may already have been assigned
//		this.ssn = "123456-1234567";
		this.name = "정찬우";
	}
	
}
