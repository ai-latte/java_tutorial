package kr.or.iei.flower.vo;

public class Reservation {
	private int rsvNum;
	private int rsvAmount;
	private String rsvProduct;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(int rsvNum, int rsvAmount, String rsvProduct) {
		super();
		this.rsvNum = rsvNum;
		this.rsvAmount = rsvAmount;
		this.rsvProduct = rsvProduct;
	}
	public int getRsvNum() {
		return rsvNum;
	}
	public void setRsvNum(int rsvNum) {
		this.rsvNum = rsvNum;
	}
	public int getRsvAmount() {
		return rsvAmount;
	}
	public void setRsvAmount(int rsvAmount) {
		this.rsvAmount = rsvAmount;
	}
	public String getRsvProduct() {
		return rsvProduct;
	}
	public void setRsvProduct(String rsvProduct) {
		this.rsvProduct = rsvProduct;
	}
	
	
}
