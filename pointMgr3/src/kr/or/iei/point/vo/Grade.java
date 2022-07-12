package kr.or.iei.point.vo;

public abstract class Grade {
	
	private String grade;
	private String name;
	private int point;
	
	public Grade() {
		super();
	}
	public Grade(String grade, String name, int point) {
		super();
		this.grade = grade;
		this.name = name;
		this.point = point;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public abstract double getBonus(); 
		// 무조건 재정의해야하는 보너스를 추상으로 강제
		// 상속해서 만드는 등급에서 실현
	
}