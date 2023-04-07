package sec01.exam06;

public class SportsCar extends Car {
	
	@Override
	public void speedUp() { speed += 10;}
	
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");  // final 을 썼기때문에 오류 재정의 할수없음.
//		speed = 0;
//	}

}
