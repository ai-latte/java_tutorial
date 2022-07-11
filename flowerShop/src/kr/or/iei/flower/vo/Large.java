package kr.or.iei.flower.vo;

public class Large extends Bouquet {

	public Large() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Large(String name, String size, int price, int amount) {
		super(name, size, price, amount);
		// TODO Auto-generated constructor stub
	}

	public int getSellPrice() {
		return (int)(getPrice()*5.5);
	}
}
