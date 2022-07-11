package kr.or.iei.flower.vo;

public class Medium extends Bouquet {
	
	
	public Medium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medium(String name, String size, int price, int amount) {
		super(name, size, price, amount);
		// TODO Auto-generated constructor stub
	}

	public int getSellPrice() {
		return (int)(getPrice()*4.5);
	}
}
