package kr.or.iei.point.vo;

public class Vip extends Grade{

	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String grade, int point, String name) {
		super(grade, point, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return (double)(getPoint()*0.1);
	}
}
