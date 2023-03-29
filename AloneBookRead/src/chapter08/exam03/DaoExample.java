package chapter08.exam03;

public class DaoExample {
	
	// 데이터 담는 그릇 DTO , VO / 데이터 처리하는것 DAO 
	// static은 정적메소드라서 필드를 생성하지 않고 사용할수있다
	
	public static void dbWork(DataAccessObject dao) {
		
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
