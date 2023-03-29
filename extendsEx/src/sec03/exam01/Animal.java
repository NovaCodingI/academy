package sec03.exam01;

// 추상메소드가 하나라도 포함되어 있으면 추상 클래스가 된다 - abstract
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

//	public void sound(); //추상메소드
	// 추상 메소드임을 알려줍니다
	// 메소드 정의만 되어 있으므로 추상 클래서는 생성이 불가능 합니다.
	// 상속받아서 구현
	public abstract void sound(); //추상메소드
	
	
}
