package sec01.exam04;

public class VariableScopeExample {
	
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		
		int v2 = 0;
		int v3 = v1 + v2  + 5;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
