package chapter08.exam03;

public interface DataAccessObject {
	
	// 상수와 추상메소드 밖에 가질수 없다.
	
	public void select();
	
	public void insert();
	
	public void update();
	
	public void delete();
	

}
