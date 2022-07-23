package kr.or.iei.point.vo;

public class Gold extends Grade {

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gold(String grade, int point, String name) {
		super(grade, point, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return (double)(0.07*getPoint());
	}
}
