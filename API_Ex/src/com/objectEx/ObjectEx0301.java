package com.objectEx;

public class ObjectEx0301 {

	public static void main(String[] args) {
		
		
		Key key1 = new Key(1); // 주소가 다르기때문에 동일하다고 나오지 않음 .equals 는 동일하게 나옴
		Key key2 = new Key(1);
		
		// Alt + Shift + a : 세로 선택 후 동시에 행열 타이밍하는 단축키
		System.out.println("key1");
		System.out.println(key1.hashCode());
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(key1.toString());
		System.out.println("******************");
		System.out.println("key2");
		System.out.println(key2.hashCode());
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println(key2.toString());
		System.out.println("******************");
		
		System.out.println("key1.equals(key2) : " + key1.equals(key2));
		
	}

}
