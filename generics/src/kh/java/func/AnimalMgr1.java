package kh.java.func;

public class AnimalMgr1 {
	
	private Animal data; //도래랑 라떼를 다루기 위해서 상위 타입 객체 만듦

	public AnimalMgr1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalMgr1(Animal data) {
		super();
		this.data = data;
	}

	public Animal getData() {
		return data;
	}

	public void setData(Animal data) {
		this.data = data;
	}
	
	
	
}
