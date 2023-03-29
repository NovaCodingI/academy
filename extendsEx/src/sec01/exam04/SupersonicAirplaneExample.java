package sec01.exam04;

public class SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		SupersonicAirplane superSonic
			= new SupersonicAirplane(SupersonicAirplane.NORMAL);
			//= new SupersonicAirplane(1);
	
		// 이륙합니다.
		superSonic.takeOff();
		superSonic.fly();
		
		// **가독성을 높여주기 위해 상수를 이용
		superSonic.flyMode = SupersonicAirplane.SUPERSONIC;
		superSonic.fly();
		
		superSonic.flyMode = SupersonicAirplane.NORMAL;
		superSonic.fly();
		
		//착륙
		superSonic.land();
		
	}
	
	// 의미가 없는 코드임 new를 통해 생성해서 사용
//	public SupersonicAirplaneExample(){
//	}
	
	

}
