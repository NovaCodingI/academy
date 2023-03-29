package sec02.exam03;

public class Tire {
	// 최대회전수
	// 타이어가 생성될 때 매개변수에 의해 초기화
	public int maxRotation;
	
	// 누적회전수
	public int accumulateRotation;
	
	// 타이어의 위치
	public String location;
	
	public Tire(String location, int maxRotation) { // int maxRotation는 변수이다 3으로 고정시켜서 상수로 만들수가있다. 대신
//		public Tire(String location) { // int를 지워주고 this.maxRotation = 3; 이라는 값을 필드 초기화해주면 된다.
		// 필드를 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}

	/**
	 * 타이어 1회전 - accumulateRotation 1증가
	 * 
	 * 1번 실행 할때마다누적 회전수를 증가시킵니다.
	 * 만약 maxRotation(최대회전수보다 크면 false를 리턴 합니다.)
	 * @return
	 */
	public boolean roll() {
		accumulateRotation++; //타이어 1회전
		System.out.println(location + " 누적 회전수 : " + accumulateRotation);
		System.out.println(location + " 최대 회전수 : " + maxRotation);
		
		if(accumulateRotation >= maxRotation) {
			System.out.println("타이어를 교체해주세요");
			// 바퀴 교체해야 한다고 알려줌
			return false; //return true; 로 하게되면 Car 클래스에 if(!next)... -> if(next)로 변경
//			return true;
		}
		return true; // return false; 로 하게되면 Car 클래스에 if(!next)... -> if(next)로 변경
//		return false;
	}
}
