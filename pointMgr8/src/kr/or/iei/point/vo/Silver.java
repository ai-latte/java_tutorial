package kr.or.iei.point.vo;

public class Silver extends Grade{

	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Silver(String grade, int point, String name) {
		super(grade, point, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return (double)(getPoint()*0.02);
	}
}
