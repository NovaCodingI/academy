package sec01.verify.exam04;

public class Member {
	private String id;
	private String name;
	
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member.toString());
		System.out.println(member); // toString() 결과를 출력
	}
	
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


//	public String getId() {
//		return id;
//	}
//
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return getId() + ":" + getName();
//	}
	
	@Override
	public String toString() {			// 매개변수가 없다면 this를 안해도 됌. toString(String id){ return this.id + ":" + this.name;}
		return id + ":" + name;
	}
	
	
}
