package kh.java.func;

public class Bclass extends Aclass {
	// A클래스에 상속받았다
	// A가 가진 건 B도 다 갖고 있다
	// B는 A보다 규모가 크거나 같다
	// A의 멤버 중 접근제어지시자가 private면, 사용할 수 없음
	// getter, setter
	// 생성자는 상속되지 않는다
	
	int num1;

	public Bclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bclass(int num, String str) {
		super(num, str);
		// TODO Auto-generated constructor stub
	}

	public Bclass(int num1) {
		super();
		this.num1 = num1;
	}

	public Bclass(int num1, int num, String str) {
		//super(num, str);
		System.out.println("Bconstructor");
		this.num1 = num1;
	}
	
	// 부모의 시계를 고쳐쓰는 것
	@Override
	public void overTest() {
		System.out.println("B클래스 메서드");
	}
	
}
