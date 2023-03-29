package sec02.exam03;

public class KumhoTire extends Tire {

	//Implicit super constructor Tire() is undefined for default constructor. Must define an explicit constructor
	public KumhoTire(String location, int maxRotation) {
		// 부모가 가진 생성자를 호출
		// 생성자를 만들면 기본생성자가 생성되지 않습니다.
		super(location, maxRotation + 2);
	}
	
	@Override
	public boolean roll() {
			accumulateRotation++; //타이어 1회전
			System.out.println("***** 금호타이어" + location + " 누적 회전수 : " + accumulateRotation);
			System.out.println("***** 금호타이어" + location + " 최대 회전수 : " + maxRotation);
			
			if(accumulateRotation >= maxRotation) {
				System.out.println("타이어를 교체해주세요");
				// 바퀴 교체해야 한다고 알려줌
				return false; 
			}
			return true;
	}
	
}
