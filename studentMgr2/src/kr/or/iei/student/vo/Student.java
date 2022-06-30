package kr.or.iei.student.vo;

public class Student {
	private String name;
	private int age;
	private String addr;
	// 데이터가 되는 클래스 (VO)
	// 1. 기본 생성자
	// 2. 모든 변수값을 저장할 수 있는 매개변수 생성자
	// 3. getter, setter
	
	//기본생성자
	public Student() {
		
	}
	//매개변수가 모두 있는 생성자
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}// 클래스 끝