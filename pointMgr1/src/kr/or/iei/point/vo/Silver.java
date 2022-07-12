package kr.or.iei.point.vo;

public class Silver {
	private String name;
	private String grade;
	private int point;
	
	// 1. 기본 생성자
	public Silver() {
	}
	
	// 2. 매개변수가 다있는 생성자
	public Silver(String grade, String name, int point) {
		this.grade = grade;
		this.name = name;
		this.point = point;
	}
	
	// 3. getter setter
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getPoint() {
		return point;
	}
	
	public double getBonus() {
		return point*0.02;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
}