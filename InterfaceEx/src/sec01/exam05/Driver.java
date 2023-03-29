package sec01.exam05;

public class Driver {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		// 인터페이스의 구현체를 생성하여 매개변수에 넣어줍니다.
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		// Bus가 구현체고 타입으로 사용할수있다.
		
	}
	
	public void drive(Vehicle vehicle) {
		
		
		vehicle.run();
		
		// 원래 타입으로 강제 형변환 // Vehicle에 public void checkFare();가 없을때 bus에 있는 checkFare(); 를 끌어다옴
		// 강제 형변환시 castingException이 발생할 소지가 있으므로
		// 객체의 생성타입을 먼저 체크한다
		// 객체 instanceof 타입 : 객체가 타입으로 생성되었는지를 체크
		
		//만약 이 타입이 일치한다면 실행시켜죠
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		
//		Bus bus = (Bus)vehicle;
//		bus.checkFare();
		
		
		vehicle.checkFare(); // Vehicle인 인터페이스에 public void checkFare();을 넣어줬기때문에 가능함
		
		
		
	}


}
