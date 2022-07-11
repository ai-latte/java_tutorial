package kr.or.iei.flower.vo;

public abstract class Bouquet {
	private String name;
	private String size;
	private int price;
	private int amount;
	
	public Bouquet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bouquet(String name, String size, int price, int amount) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public abstract int getSellPrice();
	
	
}
