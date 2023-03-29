package sec02.exam03;

public class Main {
	public static void main(String[] args) {
		// 자동차 객체를 생성합니다.
//		Car car = new Car();
		Car car = new Car(
							new Tire("FR", 3)
							, new KumhoTire("FL",3)
							, new KumhoTire("BR",3)
							, new KumhoTire("BL",3));

		// 10번 실행
		for(int i=0;i<10;i++) {
			// 자동차가 달려갑니다.
			int res = car.run();
			if(res>0) {
				car.changeTire(res);
				
			}
		}
		
	}

}
