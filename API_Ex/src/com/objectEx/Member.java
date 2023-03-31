package com.objectEx;

public class Member {
	
	public static void main(String[] args) {
		
		
		
		Member member = new Member("id");
		
		System.out.println("*************************************");
		/**
		 * hashCode() 
		 * 
		 * 객체를 식별하는 하나의 정수값
		 * Object 클래스의 객체 해시코드 메소드는 객체 메모리 번지를 이용하여
		 * 해시코드를 만들어 리턴 합니다.
		 * ===>>> 객체마다 다른 값을 가집니다.
		 * 
		 * 두객체가 동등한지 비교하는데 사용되어 집니다.
		 */
		
		System.out.println(member.hashCode());  // 반환해주는 숫자가지고 주소값이라고 부름
		// 16진수로 변환
		Object obj = new Object();
		obj.equals(obj);
		String str = Integer.toHexString(member.hashCode());
		str.equals(str);
		System.out.println("hashCode 16진수로 변환 : " + str);
		System.out.println(member.toString()); // object의 프로젝트를 알고 싶어서
		System.out.println("*************************************");
		
		Member member1 = new Member("id");
		// equals : 두 객체를 비교 합니다.
		member.equals(member);
//		System.out.println("member.equals(member1) : ");
//		System.out.println(member.equals(member1));
	}
	
	// Object.equals : 주소값비교
	
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	/**
	 * this(Member 객체) 객체가 가지고 있는 id 값과 
	 * 매개변수로 받은 Object의 id값이 일치 하는지 비교
	 */
	public boolean equals(Object obj) {
//		return super.equals(obj); // 부모가 구현해놓은걸 다시 호출하고있다.
		if(obj instanceof Member) {
			Member member = (Member)obj;
			System.out.println("object.equals() 결과 :"
										+ " " + super.equals(obj));
			System.out.println("Member.equals() 결과 : "
										+ getId().equals(member.id));
			
			// 객체가 가지고 있는 id 값이 같다면 true 아니면 false;
			if(getId().equals(member.id)) {
				return true;
			} else {
				return false;
			}
		}
//		if(this.id == ((Member)obj).getId()) {
//			
//		}
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
