package car.common;

public class Car01 {
	
	
	// 필드 생성
	String model;
	String color;
	int maxSpeed;
	
	
	// "생성자의 오버로딩" // 오버라이딩과 비교해서 외우도록해라 ㅎㅅㅎ;
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징
	// 클래스명과 동일하고 반환타입이 없다
	
	public Car01() { } // 기본생성자
	 
	public Car01(String model) {
		// -> 코드블럭 안에서는 로컬 변수가 우선 되므로 아무런 의미가 없음
		// model = model;
		this.model = model;
		
	} // 생성자 오버로딩
	
	public Car01(String model, String color) {
		
		this.model = model;
		this.color = color;
	}
	
	public Car01(String model, String color, int maxSpeed) {
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	public Car01(String model, int maxSpeed) {
		
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}
	
//	public Car(String model, String test) {} // 컴파일 에러 뜸, 변수이름이 다르다고 다르지 않음 //15번줄과 동일
	
	
	
	

}
