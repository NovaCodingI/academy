package sec01.verify.exam03;

import java.util.HashMap;

public class Student {
	
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return student.getStudentNum().equals(studentNum);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
	
	
