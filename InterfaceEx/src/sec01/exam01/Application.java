package sec01.exam01;

public class Application {
	public static void main(String[] args) {
		
		// 인터페이스는 생성할 수 없지만
		// 참조변수의 타입으로 사용할 수 있다
		// 인터페이스 변수 = new 구현객체;
		
		// 인터페이스의 다형성
		// 인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다
		RemoteControl rc = new Audio();
//		Audio audio = new Audio();
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
//		System.out.println(RemoteControl.MIN_VOLUME);
//		System.out.println(RemoteControl.MAX_VOLUME);
		
//		RemoteControl tv = new Television();
//		tv.turnOn();
//		tv.setVolume(7);
//		tv.turnOff();
		
		// 상속단계에 있는 부모가 인터페이스를 구현하고 있는경우
		// 인터페이스의 타입으로 생성이 가능하다
		RemoteControl smartTV = new SmartTV();
		smartTV.turnOn();
		smartTV.setVolume(7);
		smartTV.turnOff();
		
		Searchable searchable = new SmartTV();
		Television television = new SmartTV();
		
		
	}

}
