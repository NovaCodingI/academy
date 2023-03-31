package com.objectEx;

import java.util.HashMap;

public class ObjectEx2 {
	
	public static void main(String[] args) {
		/**
		 * 			타입, 타입
		 * HashMap<key, value>
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashMap = new HashMap();
		 *  
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 1. 	홍길동
		 * 2. 	너잘난
		 * 3. 	나잘난
		 */
		
		// HashMap<,>참조타입만 되므로 기본 타입은 적용이 안되므로 int 타입을 넣고싶다면
		// Integer 를 사용해보자!! parseInt를 안하는이유는 자동 형변환 되기 때문이다.
		
		
		HashMap<String, String> hashMap = new HashMap(); // 그릇을 만들어놓고
		hashMap.put("key", "value"); // 데이터를 담는다
		hashMap.put("key1", "value1"); // 데이터를 담는다
		hashMap.put(new String("key2"), "newValue"); // 데이터를 담는다
		
		hashMap.put("key4", "홍길동"); // 데이터를 담는다
		hashMap.put("key4", "너잘난"); // 데이터를 담는다
		hashMap.put("key6", "나잘난"); // 데이터를 담는다
		
		
		String str = hashMap.get("key"); // 데이터를 꺼내온다 꺼낼때는 key만 적어도 된다 그래서 key값이 동일한 값이 올수없다
		System.out.println("key" + str);
		System.out.println("key1 : " + hashMap.get("key1"));
		System.out.println("key2 : " + hashMap.get("key2"));
		
		String str1 = hashMap.get("key4"); // 데이터를 꺼내온다 꺼낼때는 key만 적어도 된다 그래서 key값이 동일한 값이 올수없다 덮어쓰기가 된다
		System.out.println("key4 : " + str1);
		System.out.println("key5 : " + hashMap.get("key5"));
		System.out.println("key6 : " + hashMap.get("key6"));
		
		HashMap<Integer, String> hashMap1 = new HashMap<>();
		hashMap1.put(1, "김나박");
		hashMap1.put(2, "이김나");
		hashMap1.put(3, "박이김");
		System.out.println("************************");
		System.out.println(hashMap1.get(1));
		System.out.println(hashMap1.get(2));
		System.out.println(hashMap1.get(3));
		System.out.println("************************");
		
		HashMap hashMap2 = new HashMap<>(); // <> 를 안넣으면 int나 String 둘다 되지만 오류가 뜰 확률이 많다 TODO
		hashMap1.put(4, "kkk");
		hashMap1.put(5, "jjj");
//		hashMap1.put("8", "lll");
		System.out.println("************************");
		System.out.println(hashMap1.get(4));
		System.out.println(hashMap1.get(5));
		System.out.println(hashMap1.get("6"));
		System.out.println("************************");
		
	}

}
