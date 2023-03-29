package sec01.exam04;

// final 키워드 클래스에 붙었을때 : 부모클래스가 될 수 없음
// ==The type SupersonicAirplane cannot
// subclass the final class Airplane == 컴파일 오류
// public final class Airplane {
public class Airplane {

//	// 없어도 되는 생성자 
	// 부모가 먼저 생성된다. 호출 안한다고 생성 안되는게 아님.0
	public Airplane(){
		System.out.println("======= Airplane 생성합니다");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
	// final 키워드 메소드에 붙었을 때: 메소드를 재정의 할 수 없다.
//	public final void fly() {
	public void fly() {
		System.out.println("일반비행 입니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
