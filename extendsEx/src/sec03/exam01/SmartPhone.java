package sec03.exam01;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	// 추상메소드를 구현 해야지만 클래스가 될 수 있다
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원을 켭니다");
	}
	// 상속받은 추상메소드를 모두 구현 해야 일반 클래스가 될 수 있다
	// 부모로부터 강제로 구현을 위임
	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다");
		// TODO Auto-generated method stub
		
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
