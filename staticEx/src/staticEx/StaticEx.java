package staticEx;

public class StaticEx {
	
//	public static String name;{
	
//	}

	public String name; // static을 쓰지 않으면 name을 쓸수가 없다. static은 메모리 영역에 넣는다고 생각하면 된다.
	
	public static void main(String[] args) {
		
		StaticEx ex = new StaticEx();
		
			String name = ex.name;
			
			System.out.println(name);
	}


}
