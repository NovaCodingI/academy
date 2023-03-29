package speed;

public class Car {
	
	// 필드 : 속성을 정의
	// 정수 speed;
	public int speed;

	// 생성자 : new 연산자에 의해 객체를 생성할때 호출
	// 1. 기본 생성자
	
	public Car(){
		
	}
	
	// 2. speed를 매개변수로 받는 생성자
	
	public Car(int speed) {
		// 초기화
		this.speed = speed;
	}
	
	
	// 메소드 : 기능을 정의
	// 1 getSpeed() : int
	
	public int getSpeed() {
		
		return speed;
	
	}
	
	
	// 2 keyTurnOnOP() : void
	
	public void keyTurnOnOp() {
		System.out.println("시동을 켭니다");
	}
	
	// 3 run() : void
	// 속도를 10씩 증가 시키면서 50까지 속도를 출력합니다.
	public void run() {

		for(int i=0;i<=50;i+=10) {
			System.out.println("i = " + i);
			// 필드에 값을 설정
			speed = i;
			System.out.println("시속 : " + speed + "km/h");
		}
		
	}

	// static 생성한 다음에 호출해야함
	public static void main(String[] args) {
		Car car = new Car();
		car.keyTurnOnOp();
		car.run();
		int speed = car.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
		
	}
}
