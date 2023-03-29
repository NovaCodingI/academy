package chapter07.exam03;

public class HttpServletExample {
	
	public static void main(String[] args) {
		// 메소드 호출
		// 클래스이름.메소드 호출로 했는데 이름만 불러도 호출이 됐당
		// HttpServletExample.method(null);
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	// Static으로 메소드 만드니까 이름도 안붙이고 부를수있는것
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
