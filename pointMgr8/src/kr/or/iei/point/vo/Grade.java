package kr.or.iei.point.vo;

public abstract class Grade {
	private String	grade;
	private int point;
	private String name;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String grade, int point, String name) {
		super();
		this.grade = grade;
		this.point = point;
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double getBonus();
}
