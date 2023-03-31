package com.objectEx;

public class Key {
	
	public int number;
//	public String str;
	
	public Key(int number) {
		this.number = number;
		
	}
	// 해시코드를 오버라이딩 하는 이유는 동일한 숫자값을 반환 할 수 있도록
	// 주석처리를 하여 비교해보자 ObjectEx3에 key(1) 이 동일한 key1 key3이. 홍길동이 덮어씌어진다.
	@Override
	public int hashCode() {
		
		// 객체의 주소값을 숫자로 반환
		// 생성된 객체마다 다른 주소값을 가지고 있다
		// return super.hashCode();
		// str.hashCode();
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {			// equals만 비교 하기엔 부족하다
		// 매개변수 obj가 key로 형변환 가능한지 확인
		if(obj instanceof Key) {
			// 가능하면 형변환 number 값 비교
			Key key = (Key) obj;
			if(this.number == key.number) {
				return true;
			}
		}
		// 가능하지 않다면 같지 않으면 false return
		return false;
	}
}
