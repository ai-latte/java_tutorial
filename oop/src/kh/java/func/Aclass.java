package kh.java.func;

public class Aclass {
	private int num;
	private String str;
	
	public Aclass() {
		System.out.println("Aconstructor");
	}

	public Aclass(int num, String str) {
		System.out.println("Aconstructor");
		this.num = num;
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	public void overTest() {
		System.out.println("A클래스 메서드");
	}
	
}
