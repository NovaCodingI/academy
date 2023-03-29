package getter.setter;

import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("123456", "홍삼원");
		// 상수 필드의 값을 변경할 수 없다.
//		p.nation = "한국"; <-- 오류 발생 : The final field Person.nation cannot be assigned
		p.name = "홍사원";
		
		
		System.out.println("파이값 : " + Person.PI);
		System.out.println("지구 반지름 : " + Person.EARTH_RADIUS + "km");
		
		// 캘린더는 기본적으로 싱글톤 형식으로 되어있다. 아닐수도 있고..? ㅎㅎ .DATE에 커서를 놓고 F3을 눌러보자
		// 싱글톤이 아니다. 내부에서 계속 새로운 객체를 만들기 때문에!!
		// new를 하지않고 사용 할 때~
		Calendar cal = Calendar.getInstance();
		// 현재 일을 출력
		int day = cal.get(Calendar.DATE);
		int day1 = cal.get(5); // 아무 값이나 넣어도 상수이기때문에 값이 바뀌지 않는다
		
		cal.get(Calendar.YEAR);
		
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();
		//실행전
		
		System.out.println(before);
		System.out.println(after);
		
		
		
		
		
		
		System.out.println(day);
		System.out.println(day1);
		
	}
}
