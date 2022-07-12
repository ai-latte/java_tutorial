package kr.or.iei.point.vo;

public class Gold extends Grade {

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Gold(String grade) {
		super(grade);
		// TODO Auto-generated constructor stub
	}



	public Gold(String grade, String name, int point) {
		super(grade, name, point);
		// TODO Auto-generated constructor stub
	}
	
	//1 생성자
	public double getBonus() {
		return getPoint()*0.05;
	}
}
