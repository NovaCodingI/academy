package sec01.exam04;

public class Application {
	
	public static void main(String[] args) {
		
		// 객체를 생성
		// 내가 정의해 놓은 class 를 타입으로 사용
		KumhoTire kumho = new KumhoTire();
		// KumhoTire가 Tire를 구현 하고 있으므로
		// Tire로 자동 형변환 된다
		Tire tire = new KumhoTire();
		
		// 다형성 : 여러가지 타입을 가질수 있는 성질
		// 1. 상속 : 자식클래스는 부모타입으로 선언할 수 있다
		//			부모타입으로 자동 형변환 된다
		// 2. 인터페이스 : 인터페이스의 구현체는 인터페이스 타입으로 선언할 수 있다
		//				인터페이스타입으로 자동 형변환 된다
		// 메소드재정의(오버라이딩)
		
		// 생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로
		// 인터페이스의 구현체가 매개변수로 넣어 줘야 합니다.
		// 인터페이스의 구현체는 추상메소드를 모두 구현 해야 하며
		// 구현체가 구현한 메소드가 실행 됩니다.
	Car kumho_car	= new Car(new KumhoTire());
	Car hankook_car	= new Car(new HankookTire());
	
	kumho_car.run();
	System.out.println("*******************");
	hankook_car.run();
	
//	car.run();
	
	}

}
