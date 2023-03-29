package car.object;

public class Person {
	
	public static void main(String[] args) {
		
		// 필드에 값을 불러오는 방법
		// 필드에 값을 수정하는 방법
		//Outline에 s는 static

		Car car = new Car();
		car.company = "르노삼성";
		
		System.out.println("car.company : " + car.company);
		System.out.println("speed : " + car.speed);
		car.speedUp();
		System.out.println("car.speedUp()");
		System.out.println("speed : " + car.speed);
		car.speed = 100;
		System.out.println("car.speed = 100");
		System.out.println("speed : " + car.speed);
		// 반환이 없는데 출력을 하려고하면 오류가 남
		// 메소드가 없는데 출력을 하려고하면 오류가 남
		
//		Car car = new Car();
//		Car carGia = new Car("기아자동차");
//		// 필드에 접근하기 위해서는 객체가 생성되어 있어야 한다
//		System.out.println("car.company : " + car.company);
//		car.speedUp();
//		System.out.println("car.speedUp :" + car.speed);
//		
//		System.out.println("carGia.company : " + carGia.company);
		
//		public void test() {
//		※ 메소드 안에 메소드를 넣을수 없다!!
//		}
	}

}
