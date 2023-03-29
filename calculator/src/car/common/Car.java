package car.common;

public class Car {
	
	
	// 필드 생성
	String model;
	String color;
	int maxSpeed;
	
//	String model = "기본모델";
//	String color = "블랙";
//	int maxSpeed = "150";
	
	// "생성자의 오버로딩" // 오버라이딩과 비교해서 외우도록해라 ㅎㅅㅎ;
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징
	// 클래스명과 동일하고 반환타입이 없다
	
	public Car() {
		//생성자 호출
		// this. : 필드
		// this() : 생성자
		// 생성자를 사용하기 위해서 매개변수에 알맞은 파라메터를 넣어줍니다.
		
		// 1. 생성자에서 다른 생성자를 호출 할 수 있다.
		// -> 중복되는 코드를 줄이기 위해서 => 깔끔 해질 수 있다 (최적화)
		this("기본모델", "블랙", 150);
		// null, null, 0 --> 11,12,13 번줄 참조
		
	} // 기본생성자
	 
	public Car(String model) {
		// -> 코드블럭 안에서는 로컬 변수가 우선 되므로 아무런 의미가 없음
		// model = model;
//		model = model;
//		this.model; 아래와 같이 바뀐다 ->
		this.model = model;
//		this(model, null, 0);
//		this(model,"블랙",150);
		
	} // 생성자 오버로딩
	
	public Car(String model, String color) {
		
		this(model, color, 150); // 생성자를 호출 하는것은 첫번째 줄에서만 가능합니다.
		// 타입의 순서가 중요하다
		this.color = color;
		this.model = model;
//		this(model, color, 150); // 첫번째줄이 아니면 오류가 난다
	}
	
	public Car(String model, String color, int maxSpeed) {
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	public Car(String model, int maxSpeed) {
		
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}
	
//	public Car(String model, String test) {} // 컴파일 에러 뜸, 변수이름이 다르다고 다르지 않음 //15번줄과 동일
	
	
	
	

}
