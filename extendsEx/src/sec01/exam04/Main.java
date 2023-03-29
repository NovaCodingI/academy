package sec01.exam04;

public class Main {
	
	public static void main(String[] args) {
		// 부모타입으로 자식객체를 생성 합니다.
		// 자동형변환 됩니다.
		Airplane airplane = new SupersonicAirplane(
									SupersonicAirplane.SUPERSONIC);
		
		// 부모타입으로 변환시
		// 1. 부모가 가지고 있는 필드 또는 메소드에만 접근이 가능하다
		// 2. 재정의 메소드 호출 시 - 자식 객체에서 재정의한 메소드가 호출
		
		// 자식객체를 부모로 생성하고 오버라이딩으로.. 자식메소드호출? 부모메소드 호출? 정처기 실기 문제로 나옴
		// 오버라이딩으로 나온 메소드는 
		
		System.out.println("재정의 메소드 호출");
		airplane.fly();
//		airplane.booster(); //안뜸 // The method booster() is undefined for the type Airplane
		
		// 자식타입으로 형변환 -> 강제형변환
		SupersonicAirplane supersonic
							= (SupersonicAirplane)airplane;
		
		// 원래 타입으로 변환 시
		// 자식클래스가 가지고 있는 필드 또는 메소드에 접근이 가능해진다.
		System.out.println("자식타입으로 강제 형변환");
		supersonic.booster();
		System.out.println(supersonic.flyMode);
		
	}

}
