package kr.or.iei.point.vo;

public class Gold extends Grade {

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gold(String grade, String name, int point) {
		super(grade, name, point);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return (double)(0.05*getPoint());
	}
	
}
