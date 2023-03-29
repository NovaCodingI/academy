package sec03.exam01;

public class Application {
	public static void main(String[] args) {
		
		// Cannot instantiate the type Phone
		// 추상 클래스는 생성이 불가능
		// 미완성된 메소드를 포함하고 있을수도 있다.
		// Phone phone = new Phone();
		
		// 추상클래스를 상속받아 추상메소드를 모두 구현 하면
		// 일반클래스로 생성 할 수 있다
		SmartPhone sp = new SmartPhone("owner");

		// 참조형 변수의 타입으로 사용이 가능하다
		// -> 다형성을 활용할 수 있다
		Phone phone = new SmartPhone("캔디");
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
		phone.turnOn();
		phone.turnOff();
		
	}

}
