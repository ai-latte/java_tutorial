package kr.or.iei.point.vo;

public abstract class Grade {
	private String Grade;
	private String name;
	private int point;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String grade, String name, int point) {
		super();
		Grade = grade;
		this.name = name;
		this.point = point;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
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
	
	public abstract double getBonus(); {
	}
}
