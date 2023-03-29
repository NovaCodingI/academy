package car.object;

public class Car {

	// 필드
	// 값을 초기화 해주지 않으면 초기값을 입력
	String company = "현대자동차";
	String model = "그랜저";
	int speed;
	boolean engineStart;
	
	// 생성자 자동생성한것 // 
	public Car(String company) {
		// 필드의 이름과 매개변수의 이름이 동일한 경우 지역변수인 매개변수가 우선됨
//		super(); // 부모생성자를 불러오는데 지금은 필요없으므로 주석처리
		// 결과적으로 블록 내부에서 company값은 매개변수의 값을 가르키고 있다
		// this : 생성된 객체를 의미 *필드 값을 접근해서..
		this.company = company; // this.company는 필드에 있는 company에 접근한다. this. "기능"
	// 생성자 자동생성한것 //
		
	}
	
	// 기본생성자 : 매개변수가 없는 생성자
	// 생성자를 만들지 않으면 컴파일러가 자동으로 만들어주는 생성자
	// 생성자를 하나라도 만들면 자동으로 만들어주지 않는다 => // class Preson 에서 그래서 오류남..
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public void speedUp() {
		
		speed += 10;
	}
	
}
