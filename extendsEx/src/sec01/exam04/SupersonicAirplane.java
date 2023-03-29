package sec01.exam04;


// 상속받을때 사용하는 키워드
// extends + 부모클래스명

public class SupersonicAirplane extends Airplane {
	 
	// 상수 - Syntax error on token "final", float expected
	// 한번 정의 후 값을 변경할 수 없다.
	// 대문자로 작성하고 단어를 연결할 경우 _를 붙여준다.
	// 비행모드를 숫자타입으로 정의
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// 비행상태
	public int flyMode;
	
	
	public SupersonicAirplane(int flyMode){
		// 부모생성자 호출
//		super();
		System.out.println("======= SupersonicAirplane 생성합니다.");
		if(flyMode == NORMAL
				|| flyMode == SUPERSONIC) {
			this.flyMode=flyMode;
		} else {
			flyMode = NORMAL;
		}
	}
	
	@Override
	public void fly() {
		// 부모가 가지고 있는 메소드를 자식클래스에서 재정의
		// 메소드를 재정의 해도 기존에 부모가 가진 메소드를 호출 할 수있다.
		// super.메소드명();
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행");
		} else {
			// fly()를 재작성 했지만
			// 부모가 가지고 있는 fly 메소드를 호출할 수 있다
			// super를 이용해서 접근
			super.fly();
		}
	}
	
	public void booster() {
		System.out.println("부스터 작동!!!");
	}

}
