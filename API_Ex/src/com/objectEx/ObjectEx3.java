package com.objectEx;

import java.util.HashMap;

public class ObjectEx3 {
	public static void main(String[] args) {
		
		
		HashMap<Key, String> keyMap = new HashMap<> ();
		Key key1 = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
//		System.out.println(keyMap.get(key1.toString())); null 값 나옴 ㅠㅠ
//		System.out.println(keyMap.get(key2.toString()));
//		System.out.println(keyMap.get(key3.toString()));
		
		System.out.println("key1 == key3 : " + key1.equals(key3));
		keyMap.put(key1, "홍길동");
		keyMap.put(key2, "나잘난");
		keyMap.put(key3, "너잘난");
		
		System.out.println(keyMap.get(key1));
		System.out.println(keyMap.get(key2));
		System.out.println(keyMap.get(key3));

	}
	
	public void checkEquals() {
		
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