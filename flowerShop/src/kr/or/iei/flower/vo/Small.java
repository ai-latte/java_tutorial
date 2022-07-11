package kr.or.iei.flower.vo;

public class Small extends Bouquet {

	public Small() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Small(String name, String size, int price, int amount) {
		super(name, size, price, amount);
		// TODO Auto-generated constructor stub
	}
	
	public int getSellPrice() {
		return (int)(getPrice()*3.5);
	}
}
