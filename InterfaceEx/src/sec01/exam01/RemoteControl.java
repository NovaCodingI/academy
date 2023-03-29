package sec01.exam01;

public interface RemoteControl {
	// 생성자를 가질 수 없음
	// 인스턴트 필드도 가질 수 없음
	// -> 상수 사용가능
	// 보통은 추상메소드를 가지고 있음

	// static final을 자동으로 붙여줍니다
	// 상수 : 대문자로 작성하고 문자가 연결될 경우 언더바(_)를 이용합니다
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 인터페이스로 생성하게 되면 추상메소드 abstract를 붙이지 않았어도 자동으로 키워드를 붙여준다
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// The blank final field hi may not have been initialized
	// public int hi;
	
}
